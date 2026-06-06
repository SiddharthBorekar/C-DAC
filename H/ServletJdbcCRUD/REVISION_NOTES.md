# Servlet + JDBC CRUD — Revision Notes

A classic **MVC** web app: JSP (View) → Servlet (Controller) → DAO → JDBC → MySQL.
No framework — just **Jakarta Servlets + plain JDBC**. Great for understanding what Spring does *for* you later.

---

## 1. The Big Picture (Architecture)

```
   Browser
     │  HTTP request (e.g. GET /users/list)
     ▼
 ┌─────────────────┐
 │  Servlet        │  ← Controller  (com.app.controller)
 │  (doGet/doPost) │
 └────────┬────────┘
          │ calls
          ▼
 ┌─────────────────┐
 │  UserDao        │  ← Data Access Object (com.app.dao)
 │  (SQL here)     │
 └────────┬────────┘
          │ getConnection()
          ▼
 ┌─────────────────┐
 │  DBConnection   │  ← JDBC connection factory (com.app.config)
 └────────┬────────┘
          │ JDBC
          ▼
       MySQL  (table: users)
          │
          ▼  data comes back as
       User objects  ← Model / POJO (com.app.model)
          │
          ▼  servlet forwards to
        JSP   ← View (renders HTML)
```

**The golden rule of MVC here:**
- **Model** = `User` (just data, getters/setters).
- **View** = JSP files (only display, no business logic).
- **Controller** = Servlets (read request → call DAO → pick a view).
- **DAO** = the *only* place that knows SQL.

---

## 2. Which Files Matter? (Importance ranking)

| ⭐ | File | Role | Why it matters |
|----|------|------|----------------|
| ⭐⭐⭐ | `dao/UserDao.java` | DAO | **Heart of the app.** All CRUD SQL lives here. |
| ⭐⭐⭐ | `config/DBConnection.java` | Config | Single place that opens the DB connection. |
| ⭐⭐⭐ | `controller/*Servlet.java` | Controllers | Wire HTTP requests to the DAO. |
| ⭐⭐ | `model/User.java` | Model | POJO carried between all layers. |
| ⭐⭐ | `views/*.jsp` | Views | Render HTML, use JSTL/EL. |
| ⭐ | `pom.xml` | Build | Declares dependencies (Servlet API, MySQL, JSTL). |
| ⭐ | `web.xml` | Config | Just sets welcome file. Routing is via annotations. |
| ⭐ | `index.jsp` | Entry | Redirects `/` → `/users/list`. |

> Ignore the `target/`, `.settings/`, `.classpath`, `.project` files — those are build output / Eclipse metadata, not your code.

---

## 3. End-to-End Flow (the 4 CRUD journeys)

### 🟢 CREATE — Add a user
```
1. user.jsp  → click "+ Add New User"     (GET /users/add)
2. AddUserServlet.doGet  → forward → add-user.jsp   (show form)
3. Submit form           (POST /users/add)
4. AddUserServlet.doPost → build User → userDao.addUser(user)
5. redirect → /users/list   (PRG pattern → back to list)
```

### 🔵 READ — List all users
```
1. GET /users/list
2. ListUserServlet.doGet → userDao.getAllUser() → List<User>
3. put list in request attribute "users"
4. forward → user.jsp → <c:forEach> renders the table
```

### 🟡 UPDATE — Edit a user
```
1. user.jsp → click "Edit?id=5"   (GET /users/edit?id=5)
2. EditUserServlet.doGet → userDao.getUserById → User
3. forward → edit-user.jsp (form pre-filled, id in hidden field)
4. Submit          (POST /users/edit)
5. EditUserServlet.doPost → userDao.updateUser(user)
6. redirect → /users/list
```

### 🔴 DELETE — Remove a user
```
1. user.jsp → click "Delete?id=5"  (JS confirm) (GET /users/delete?id=5)
2. DeleteUserServlet.doGet → userDao.deleteUser(user)
3. redirect → /users/list
```

> **PRG (Post-Redirect-Get):** after every write (add/edit/delete) we `sendRedirect` instead of `forward`. This avoids the "resubmit form on refresh" problem.

---

## 4. The Code, File by File

### 📦 `model/User.java` — the POJO
Plain data holder. Note the **3 constructors** (a common revision question):

```java
public class User {
    private int id;
    private String name;
    private String email;

    public User() {}                                   // empty → for form binding
    public User(int id, String name, String email) {…} // full → from DB (has id)
    public User(String name, String email) {…}         // no id → for INSERT (DB auto-generates id)

    // + getters and setters for id, name, email
}
```
**Why 3 constructors?** Insert doesn't have an id yet; reads from DB do.

---

### 🔌 `config/DBConnection.java` — JDBC connection factory
```java
public class DBConnection {
    private static final String URL  = "jdbc:mysql://localhost:3306/mydb";
    private static final String USER = "root";
    private static final String PASS = "";

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");   // load MySQL driver
        return DriverManager.getConnection(URL, USER, PASS);
    }
}
```
**Key points:**
- `Class.forName(...)` loads the JDBC driver (modern drivers auto-register, but it's explicit here).
- Returns a fresh `Connection` each call — DAO closes it via try-with-resources.
- DB name = `mydb`, user = `root`, no password (local dev).

---

### 🗄️ `dao/UserDao.java` — all the SQL (most important file)
Uses **`PreparedStatement`** everywhere (prevents SQL injection) and **try-with-resources** (auto-closes Connection/Statement/ResultSet).

```java
public class UserDao {

    // CREATE
    public void addUser(User u) throws ... {
        String sql = "INSERT INTO users (name, email) VALUES(?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, u.getName());
            pstmt.setString(2, u.getEmail());
            pstmt.executeUpdate();          // executeUpdate → for INSERT/UPDATE/DELETE
        }
    }

    // READ all
    public List<User> getAllUser() throws ... {
        String sql = "SELECT * FROM users";
        List<User> list = new ArrayList<>();
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {     // executeQuery → for SELECT
            while (rs.next()) {
                list.add(new User(rs.getInt("id"),
                                  rs.getString("name"),
                                  rs.getString("email")));
            }
        }
        return list;
    }

    // READ one
    public User getUserById(User user) throws ... {
        String sql = "SELECT * FROM users WHERE ID = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, user.getId());
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return new User(rs.getInt("id"), rs.getString("name"), rs.getString("email"));
                }
            }
        }
        return null;   // not found
    }

    // UPDATE
    public void updateUser(User user) throws ... {
        String sql = "UPDATE users SET name = ?, email = ? WHERE id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, user.getName());
            pstmt.setString(2, user.getEmail());
            pstmt.setInt(3, user.getId());
            pstmt.executeUpdate();
        }
    }

    // DELETE
    public void deleteUser(User user) throws ... {
        String sql = "DELETE FROM users WHERE ID = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, user.getId());
            pstmt.executeUpdate();
        }
    }
}
```

**Must-remember JDBC facts:**
- `executeQuery()` → returns `ResultSet` → use for **SELECT**.
- `executeUpdate()` → returns int (rows affected) → use for **INSERT / UPDATE / DELETE**.
- `?` placeholders + `setString/setInt` = parameterized → **safe from SQL injection**.
- `rs.next()` advances the cursor; `while` for many rows, `if` for one row.
- try-with-resources auto-closes everything (no `finally` block needed).

---

### 🎮 The Servlets (Controllers)

All share the same shape:
- Mapped by **`@WebServlet("/users/...")`** annotation (no XML needed).
- Hold `private final UserDao userDao = new UserDao();`
- `serialVersionUID` because `HttpServlet` is `Serializable`.
- Catch exceptions and rethrow as `ServletException`.

**`ListUserServlet`** → `/users/list` (READ)
```java
@WebServlet("/users/list")
protected void doGet(req, res) {
    List<User> users = userDao.getAllUser();
    req.setAttribute("users", users);                 // hand data to the view
    req.getRequestDispatcher("/WEB-INF/views/user.jsp").forward(req, res);
}
// doPost just calls doGet
```

**`AddUserServlet`** → `/users/add` (CREATE)
```java
@WebServlet("/users/add")
doGet  → forward to add-user.jsp           // show the form
doPost → read params → userDao.addUser() → sendRedirect("/users/list")
```

**`EditUserServlet`** → `/users/edit` (UPDATE)
```java
@WebServlet("/users/edit")
doGet  → parse id → getUserById → forward to edit-user.jsp (pre-filled form)
doPost → read id+name+email → updateUser → redirect to list
```

**`DeleteUserServlet`** → `/users/delete` (DELETE)
```java
@WebServlet("/users/delete")
doGet  → parse id → deleteUser → redirect to list
// doPost calls doGet
```

**`forward` vs `redirect` (very common exam question):**
| | forward | redirect |
|---|---------|----------|
| Who | server-side (RequestDispatcher) | client re-requests (302) |
| URL | stays the same | changes in browser |
| Request attributes | survive (`setAttribute` works) | lost (new request) |
| Used here for | showing a JSP (read) | after writes (PRG) |

---

### 🖼️ The JSP Views

**`user.jsp`** — the list table. Uses **JSTL `<c:forEach>`** + **EL `${...}`**:
```jsp
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
...
<c:forEach var="user" items="${users}">   <%-- "users" = the request attribute --%>
  <tr>
    <td>${user.id}</td>                    <%-- EL calls user.getId() --%>
    <td>${user.name}</td>
    <td>${user.email}</td>
    <td>
      <a href="...../users/edit?id=${user.id}">Edit</a> |
      <a href="...../users/delete?id=${user.id}"
         onclick="return confirm('Delete this user?')">Delete</a>
    </td>
  </tr>
</c:forEach>
```
- `${pageContext.request.contextPath}` = app's base URL (avoids hardcoding).
- `${user.name}` → EL automatically calls the getter `getName()`.

**`add-user.jsp`** — empty form, `method="post"` → `/users/add`.
**`edit-user.jsp`** — pre-filled form, **hidden `id` field** so the servlet knows which row to update.
**`index.jsp`** — just redirects to `/users/list` (welcome page).

> JSPs live under **`WEB-INF/`** → cannot be accessed directly by URL. They're only reachable via servlet forwards. This is intentional (security): users always go through a controller.

---

## 5. Config Files

**`pom.xml`** — dependencies to remember:
| Dependency | Purpose | Scope |
|-----------|---------|-------|
| `jakarta.servlet-api` 6.0 | Servlet API | `provided` (Tomcat supplies it) |
| `mysql-connector-j` 8.4 | JDBC driver | `compile` |
| `jakarta...jstl-api` + `glassfish jstl` | JSTL tags for JSP | runtime |
- Packaging = **`war`** (deploys to Tomcat). Java **17**.

**`web.xml`** — minimal. Only declares the welcome file (`index.jsp`).
All routing is done with **`@WebServlet` annotations**, not XML.

---

## 6. Quick Q&A (self-test)

1. **Where is all the SQL?** → `UserDao.java` only.
2. **How are URLs mapped to servlets?** → `@WebServlet("/users/...")` annotations.
3. **Why `PreparedStatement` not `Statement`?** → Prevents SQL injection + precompiled.
4. **`executeQuery` vs `executeUpdate`?** → SELECT vs INSERT/UPDATE/DELETE.
5. **Why redirect after add/edit/delete?** → PRG pattern, avoids duplicate submits on refresh.
6. **Why are JSPs under WEB-INF?** → Not directly accessible; must go through a servlet.
7. **How does data reach the JSP?** → `request.setAttribute("users", list)` then `forward`.
8. **What closes the DB connections?** → try-with-resources (auto-close).
9. **Why 3 User constructors?** → no-arg (forms), with-id (DB reads), without-id (inserts).
10. **Model / View / Controller mapping?** → User / JSP / Servlet.

---

## 7. The "users" Table (assumed schema)
```sql
CREATE TABLE users (
    id    INT PRIMARY KEY AUTO_INCREMENT,
    name  VARCHAR(100),
    email VARCHAR(100)
);
```

---

### One-line summary
> **JSP form → Servlet (controller) reads params → UserDao runs JDBC SQL via DBConnection → MySQL → results as User objects → forwarded back to JSP for display. Writes redirect to the list (PRG).**
