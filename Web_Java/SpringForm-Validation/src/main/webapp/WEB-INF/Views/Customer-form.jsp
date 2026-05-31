<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer-Form</title>
<style type="text/css">
.error {
	color: red;
}
</style>
</head>
<body>
	<form:form action="process" modelAttribute="theCustomer" method="post">
		<table>
			<tr>
				<td>Enter FirstName:</td>
				<td><form:input path="firstName" /></td>
			</tr>

			<tr>
				<td>Enter LastName:</td>
				<td><form:input path="lastName" /> <form:errors path="lastName"
						cssClass="error">
					</form:errors></td>
			</tr>

			<tr>
				<td></td>
				<td><form:button>Submit</form:button></td>
			</tr>
		</table>
	</form:form>
</body>
</html>