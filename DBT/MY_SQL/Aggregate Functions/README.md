# 📊 SQL Practice – Aggregate Functions

This repository contains **SQL queries based on Aggregate Functions** used for **data analysis and summarizing data**.

Aggregate functions perform calculations on **multiple rows of a table** and return **a single summarized value**.

These queries are written using relations from a **Student Management Database**.

---

## 📂 Database Relations Used

The following tables are used to solve the SQL queries:

- student  
- faculty  
- course  
- modules  
- course_modules  
- course_batches  
- batch_students  
- student_phone  
- faculty_phone  
- student_address  
- faculty_address  
- student_qualifications  
- faculty_qualifications  
- student_cards  
- student_order  

---

# 📊 Aggregate Functions

Aggregate functions are used to **perform calculations on a group of rows** and return **a single value**.

They are commonly used with the **GROUP BY clause**.

---

## 🔢 Common Aggregate Functions

| Function | Description |
|--------|-------------|
| COUNT() | Counts number of rows |
| SUM() | Calculates total sum |
| AVG() | Calculates average value |
| MIN() | Returns minimum value |
| MAX() | Returns maximum value |

---

# 1️⃣ COUNT() Function

The **COUNT()** function returns the **total number of rows**.

### Example

```sql
SELECT COUNT(*) 
FROM student;
```

Output: Returns the **total number of students**.

---

# 2️⃣ SUM() Function

The **SUM()** function calculates the **total sum of a numeric column**.

### Example

```sql
SELECT SUM(duration)
FROM course;
```

Output: Returns the **total duration of courses**.

---

# 3️⃣ AVG() Function

The **AVG()** function calculates the **average value of a column**.

### Example

```sql
SELECT AVG(duration)
FROM course;
```

Output: Returns the **average course duration**.

---

# 4️⃣ MIN() Function

The **MIN()** function returns the **smallest value** in a column.

### Example

```sql
SELECT MIN(DOB)
FROM student;
```

Output: Returns the **earliest date of birth**.

---

# 5️⃣ MAX() Function

The **MAX()** function returns the **largest value** in a column.

### Example

```sql
SELECT MAX(DOB)
FROM student;
```

Output: Returns the **latest date of birth**.

---

# 📑 Aggregate Functions with GROUP BY

Aggregate functions can also be used with **GROUP BY** to calculate results for each group.

### Example

```sql
SELECT courseID, COUNT(studentID)
FROM batch_students
GROUP BY courseID;
```

Output: Displays the **number of students in each course**.

---

# ⚠️ Important Notes

- Aggregate functions **ignore NULL values** except `COUNT(*)`
- Used for **data analysis and reporting**
- Often combined with **GROUP BY** and **HAVING**

---

# 🎯 Purpose of This Repository

This project helps practice:

- SQL Aggregate Functions  
- Data Analysis using SQL  
- Grouping and Summarizing Data  
- Writing Efficient SQL Queries  

---

# 🧑‍💻 Author

**Siddharth Borekar**

Learning **SQL, C++, and Database concepts** through practical database exercises.