<%@	page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login.jsp</title>
</head>
<body>
	
	<%
	String name = (String)request.getAttribute("name");
	String email = (String)request.getAttribute("email");
	String course = (String)request.getAttribute("course");
	%>

	<h1>Registration Successful</h1>

	<h3>Student Details</h3>

	Name: <%= name %> <br><br>
	Email: <%= email %> <br><br>
	Course: <%= course %>
		
</body>
</html>