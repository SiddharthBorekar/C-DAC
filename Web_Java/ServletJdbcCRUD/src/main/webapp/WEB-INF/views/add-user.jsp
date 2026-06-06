<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Add user here</h2>
	<form method="post"
		action="${pageContext.request.contextPath}/users/add">
		<label>Name: <input type="text" name="name" required /></label><br />
		<label>Email: <input type="text" name="email" required />

			<button type="submit">Add User</button>
		</label> <a href="${pageContext.request.contextPath}/users/list">Cancel</a>
	</form>
</body>
</html>