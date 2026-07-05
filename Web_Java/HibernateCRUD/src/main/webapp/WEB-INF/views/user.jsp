<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Users List</h1>
	<a href="${pageContext.request.contextPath}/users/add">Add new User</a>

	<table border="1">
		<tr>
			<td>ID</td>
			<td>Name</td>
			<td>Email</td>
			<td>Actions</td>
		</tr>
		<c:forEach var="user" items="${users}">
			<tr>
				<td><c:out value="${user.id}" /></td>
				<td><c:out value="${user.name}" /></td>
				<td><c:out value="${user.email}" /></td>
				<td><a
					href="${pageContext.request.contextPath}/users/edit?id=${user.id}">Edit</a>
					| <a
					href="${pageContext.request.contextPath}/users/delete?id=${user.id}">Delete</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>