<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Course Registration</title>

<style>

body{
    margin:0;
    padding:0;
    font-family:Arial, sans-serif;
    background:#f2f2f2;
}

.container{
    width:400px;
    background:white;
    margin:60px auto;
    padding:30px;
    border-radius:10px;
    box-shadow:0px 0px 10px gray;
}

h1{
    text-align:center;
    color:#333;
    margin-bottom:25px;
}

form{
    display:flex;
    flex-direction:column;
}

label{
    margin-top:12px;
    font-weight:bold;
}

input, select{
    padding:10px;
    margin-top:5px;
    border:1px solid gray;
    border-radius:5px;
    font-size:15px;
}

button{
    margin-top:20px;
    padding:12px;
    background-color:blue;
    color:white;
    border:none;
    border-radius:5px;
    font-size:16px;
    cursor:pointer;
}

button:hover{
    background-color:darkblue;
}

a{
    text-decoration:none;
    text-align:center;
    margin-top:15px;
    display:block;
    color:blue;
}

</style>

</head>

<body>

<div class="container">

    <h1>Course Registration</h1>

    <form action="Register" method=post>

        <label>Student Name</label>
        <input type="text" name="name" placeholder="Enter your name">

        <label>Email</label>
        <input type="email" name="email" placeholder="Enter your email">

        <label>Password</label>
        <input type="password" name="password" placeholder="Enter password">

        <label>Course Details</label>

        <select name="course"	>

            <option value="">Select Course</option>
            <option value="Java">Java</option>
            <option value="Python">Python</option>
            <option value="Web Development">Web Development</option>
            <option value="Data Science">Data Science</option>
            
        </select>

        <button type="submit">Register</button>	

    </form>

</div>

</body>
</html>