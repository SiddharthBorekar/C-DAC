# 📊 DML Commands in SQL

> **Data Manipulation Language (DML)** commands are used to retrieve and manipulate data stored in database tables.

This guide focuses on **SELECT queries** using:

- `WHERE`
- `GROUP BY`
- `HAVING`
- `ORDER BY`
- `LIMIT`

---

## 📌 1. SELECT Statement

The `SELECT` statement is used to **retrieve data from a database table**.

```sql
SELECT column1, column2
FROM table_name;
```

Example:

```sql
SELECT * FROM student;
```

---

## 🔍 2. WHERE Clause

The `WHERE` clause is used to **filter records** based on a specific condition.

```sql
SELECT * 
FROM student
WHERE ID = 101;
```

Example:

```sql
SELECT namefirst, namelast
FROM student
WHERE ID > 5;
```

---

## 📦 3. GROUP BY Clause

The `GROUP BY` clause groups rows that have **same values in specified columns**.

```sql
SELECT column_name, COUNT(*)
FROM table_name
GROUP BY column_name;
```

Example:

```sql
SELECT course_id, COUNT(student_id)
FROM batch_students
GROUP BY course_id;
```

---

## ⚠️ 4. HAVING Clause

The `HAVING` clause is used with `GROUP BY` to **filter grouped records**.

```sql
SELECT column_name, COUNT(*)
FROM table_name
GROUP BY column_name
HAVING COUNT(*) > 2;
```

Example:

```sql
SELECT course_id, COUNT(student_id)
FROM batch_students
GROUP BY course_id
HAVING COUNT(student_id) > 5;
```

---

## 📑 5. ORDER BY Clause

The `ORDER BY` clause is used to **sort the result** in ascending or descending order.

```sql
SELECT * 
FROM student
ORDER BY namefirst ASC;
```

Descending order:

```sql
SELECT * 
FROM student
ORDER BY namefirst DESC;
```

---

## 🔢 6. LIMIT Clause

The `LIMIT` clause restricts the **number of rows returned**.

```sql
SELECT * 
FROM student
LIMIT 5;
```

Example:

```sql
SELECT * 
FROM student
ORDER BY ID DESC
LIMIT 10;
```

---

## 🧠 Combined Example

Using multiple clauses together:

```sql
SELECT course_id, COUNT(student_id)
FROM batch_students
WHERE student_id > 10
GROUP BY course_id
HAVING COUNT(student_id) > 2
ORDER BY course_id DESC
LIMIT 5;
```

---

## 📚 Summary Table

| Clause | Purpose |
|------|------|
| `WHERE` | Filter rows |
| `GROUP BY` | Group rows with same values |
| `HAVING` | Filter grouped results |
| `ORDER BY` | Sort results |
| `LIMIT` | Restrict number of rows |

---

⭐ **Tip:** These clauses are commonly used together to create powerful SQL queries for data analysis.