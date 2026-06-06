<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Users list</title>
</head>
<body>
	<h2>All users list:</h2>
	<a href="${pageContext.request.contextPath}/users/add">+ Add New
		User</a>
	<hr />
	<table border="1" cellpadding="6">
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Email</th>
				<th>Actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="user" items="${users}">
				<tr>
					<td>${user.id}</td>
					<td>${user.name}</td>
					<td>${user.email}</td>
					<td><a
						href="${pageContext.request.contextPath}/users/edit?id=${user.id}">Edit</a>
						| <a
						href="${pageContext.request.contextPath}/users/delete?id=${user.id}"
						onclick="return confirm('Delete this user?')">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>