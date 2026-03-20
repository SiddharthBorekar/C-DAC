# 📘 Functions in PL/SQL

## 📌 Introduction

A **function in PL/SQL** is a named block that performs a specific task and **always returns a value**. It is mainly used to encapsulate logic that can be reused multiple times in SQL or PL/SQL programs.

---

## ⚙️ Syntax

```sql
CREATE OR REPLACE FUNCTION function_name (parameters)
RETURN datatype
IS
    -- variable declarations
BEGIN
    -- logic
    RETURN value;
END;
```

---

## 🔑 Key Features

* Must return **exactly one value**
* Can be used inside **SQL statements (SELECT, WHERE, etc.)**
* Improves **code reusability**
* Supports **parameters (IN, OUT, IN OUT)**

---

## 🧠 Example

```sql
CREATE OR REPLACE FUNCTION sum_marks(m1 NUMBER, m2 NUMBER)
RETURN NUMBER
IS
    total NUMBER;
BEGIN
    total := m1 + m2;
    RETURN total;
END;
```

### ▶️ Calling the Function

```sql
SELECT sum_marks(67, 74) FROM dual;
```

---

## 📊 Example (Database Table)

```sql
CREATE OR REPLACE FUNCTION get_total_marks(sid NUMBER)
RETURN NUMBER
IS
    total NUMBER;
BEGIN
    SELECT 
        NVL(MAX(CASE WHEN name = '10' THEN marks END),0) +
        NVL(MAX(CASE WHEN name = '12' THEN marks END),0)
    INTO total
    FROM student_qualifications
    WHERE studentID = sid;

    RETURN total;
END;
```

---

## 🚀 Advantages

* Reusable code
* Modular programming
* Can be called inside SQL queries
* Improves readability

---

## ⚠️ Limitations

* Returns only **one value**
* Cannot perform **DML operations (like INSERT/UPDATE)** directly in SQL context
* Slight overhead when called repeatedly

---

## 🔥 Difference: Function vs Procedure

| Feature      | Function            | Procedure           |
| ------------ | ------------------- | ------------------- |
| Return value | Must return 1 value | Can return multiple |
| Usage        | Used in SELECT      | Called using CALL   |
| Focus        | Computation         | Task execution      |

---

## 💡 Conclusion

PL/SQL functions are powerful tools for performing calculations and returning results efficiently. They help in writing clean, reusable, and modular database code.

---
