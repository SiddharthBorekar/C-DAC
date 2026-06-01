<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Customers</title>
</head>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f4f6f9;
	margin: 40px;
}

h2 {
	color: #333;
	text-align: center;
}

hr {
	margin-bottom: 20px;
}

input[type="button"] {
	background-color: #28a745;
	color: white;
	border: none;
	padding: 10px 18px;
	border-radius: 5px;
	cursor: pointer;
	font-size: 14px;
}

input[type="button"]:hover {
	background-color: #218838;
}

table {
	width: 100%;
	border-collapse: collapse;
	background-color: white;
	box-shadow: 0px 2px 10px rgba(0, 0, 0, 0.1);
}

th {
	background-color: #007bff;
	color: white;
	padding: 12px;
	text-align: left;
}

td {
	padding: 10px;
	border-bottom: 1px solid #ddd;
}

tr:nth-child(even) {
	background-color: #f8f9fa;
}

tr:hover {
	background-color: #e9ecef;
}

a {
	text-decoration: none;
	font-weight: bold;
}

a[href*="Update"] {
	color: #007bff;
}

a[href*="Delete"] {
	color: #dc3545;
}

a:hover {
	text-decoration: underline;
}
.update-btn {
    color: #007bff;
    font-weight: bold;
}

.delete-btn {
    color: #dc3545;
    font-weight: bold;
}

.update-btn:hover,
.delete-btn:hover {
    text-decoration: underline;
}
</style>
<body>
	<h2>CRM - Customer Relational Manager</h2>
	<hr />
	<input type="button" value="Add Customer"
		onclick="window.location.href = 'showForm'; return false;" />
	<br>
	<br>
	<table border="1">
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>

		<c:forEach var="tempCustomer" items="${listCust}">
			<c:url var="updateLink" value="/customer/showFormForUpdate">
				<c:param name="customerId" value="${tempCustomer.id}" />
			</c:url>
			<c:url var="deleteLink" value="/customer/delete">
				<c:param name="customerId" value="${tempCustomer.id}" />
			</c:url>
			<tr>
				<td>${tempCustomer.firstName}</td>
				<td>${tempCustomer.lastName}</td>
				<td>${tempCustomer.email}</td>
				<td><a class="update-btn" href="${updateLink}">Update</a></td>
				<td><a class="delete-btn" href="${deleteLink}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>