<%@page import="com.app.dao.BookDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="b" class="com.app.entity.Book"></jsp:useBean>
<jsp:setProperty property="*" name="b"/>
<%
int status = BookDAO.saveBook(b);
if(status>=1)
	response.sendRedirect("../index.jsp");
%>
</body>
</html>