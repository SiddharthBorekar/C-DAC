<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Edit User</title>
</head>
<body>

	<h2>Edit User</h2>

	<form method="post"
		action="${pageContext.request.contextPath}/users/edit">

		<input type="hidden" name="id" value="${user.id}" /> Name: <input
			type="text" name="name" value="${user.name}" /><br>
		<br> Email: <input type="text" name="email" value="${user.email}" /><br>
		<br> <input type="submit" value="Update User" /> <a
			href="${pageContext.request.contextPath}/users/list">Cancel</a>

	</form>

</body>
</html>