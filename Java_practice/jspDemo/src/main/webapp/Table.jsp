<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Table.jsp</title>
</head>
<body>
	<% 
			int no = Integer.parseInt(request.getParameter("textNum"));
	%>
	
	<table border="1"></table>
	<% for(int i=0;i<10;
			i++) {%>
	<tr>
	<td><%= (no*i) %></td>
	</tr>
	<%} %>
</body>
</html>