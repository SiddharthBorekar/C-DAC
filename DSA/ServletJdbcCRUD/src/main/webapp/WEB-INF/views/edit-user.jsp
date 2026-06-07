<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Edit User</title>
</head>
<body>

	<h2>Edit User</h2>

	<form action="${pageContext.request.contextPath}/users/edit"
		method="post">
		<input type="hidden" name="id" value="${user.id}" /> <label>Name:
			<input type="text" name="name" value="${user.name}" required />
		</label><br /> <label>Email: <input type="email" name="email"
			value="${user.email}" required /></label><br />

		<button type="submit">Update User</button>
		<a href="${pageContext.request.contextPath}/users/list">Cancel</a>
	</form>

</body>
</html>