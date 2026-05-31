<%@page import="com.app.dao.BookDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.app.entity.Book"%>
    <%
    Book book = BookDAO.getBookById(Integer.parseInt(request.getParameter("id")));
    request.setAttribute("book", book);
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="update.jsp" method="post">
<table>
<tr>
<td><input hidden="hidden" name="id" value="<%= book.getId() %>"> </td>
</tr>
<tr>
<td>Enter Book Title:</td>
<td><input type="text" name="title" value="<%=book.getTitle() %>"></td>
</tr>
<tr>
<td>Enter Book Author:</td>
<td><input type="text" name="author" value="<%=book.getAuthor() %>"></td>
</tr>
<tr>
<td>Enter Book Price:</td>
<td><input type="text" name="price" value="<%=book.getPrice() %>"></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="SUBMIT"></td>
</tr>
</table>
</form>
</body>
</html>