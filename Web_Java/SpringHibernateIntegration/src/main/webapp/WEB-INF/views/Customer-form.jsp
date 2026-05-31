<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Spring MVC 5 - CRUD operation</h2>
<h3>Customer form</h3>
<hr>
<form:form action="saveCustomer" method="POST" modelAttribute="customer">
	<table>

	<tr><form:hidden path="id"/></tr>
	<tr><td>Enter First name </td>
	<td><form:input path="firstName"/></td>
	</tr>
	<tr><td>Enter Last name </td>
	<td><form:input path="lastName"/></td>
	</tr>
	<tr><td>Enter email </td>
	<td><form:input path="email"/></td>
	</tr>
	<tr><td></td>
	<td><form:button>SUBMIT</form:button></td>
	</tr>
	</table>

</form:form>
</body>
</html>