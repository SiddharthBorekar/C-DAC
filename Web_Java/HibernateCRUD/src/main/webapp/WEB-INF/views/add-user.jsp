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
	<h1>Add user</h1>
	<form method="post"
		action="${pageContext.request.contextPath}/users/add">
		Name: <input type="text" name="name" /> <br> Email: <input
			type="text" name="email" /> <br> <input type="submit"
			value="Add User" /> <a
			href="${pageContext.request.contextPath}/users/list">Cancel</a>
	</form>
</body>
</html>