<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<style>
body {
    font-family: Arial, sans-serif;
    background-color: #f4f6f9;
    display: flex;
    justify-content: center;
    align-items: center;
    min-height: 100vh;
    margin: 0;
}

.container {
    background: white;
    padding: 25px;
    border-radius: 8px;
    box-shadow: 0px 2px 10px rgba(0,0,0,0.1);
    width: 400px;
}

h2, h3 {
    text-align: center;
    color: #333;
}

hr {
    margin-bottom: 20px;
}

table {
    width: 100%;
}

td {
    padding: 8px;
}

input[type="text"],
input[type="email"] {
    width: 100%;
    padding: 8px;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}

button {
    background-color: #007bff;
    color: white;
    border: none;
    padding: 10px 15px;
    border-radius: 4px;
    cursor: pointer;
}

button:hover {
    background-color: #0056b3;
}
</style>


<body>
	 <div class="container">
        <h2>Spring MVC 5 - CRUD Operation</h2>
        <h3>Customer Form</h3>
        <hr>
	<form:form action="saveCustomer" method="POST"
		modelAttribute="customer">
		<table>

			<tr>
				<form:hidden path="id" />
			</tr>
			<tr>
				<td>Enter First name</td>
				<td><form:input path="firstName" /></td>
			</tr>
			<tr>
				<td>Enter Last name</td>
				<td><form:input path="lastName" /></td>
			</tr>
			<tr>
				<td>Enter email</td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td></td>
				<td><form:button>SUBMIT</form:button></td>
			</tr>
		</table>

	</form:form>
</body>
</html>