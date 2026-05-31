<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="true"%>
    <%@ taglib uri="jakarta.tags.core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Book Details:</h2>
<hr>
<table>
<tr>
<th>ID</th>
<th>Title</th>
<th>Author</th>
<th>Price</th>
<th>Edit</th>
<th>Delete</th>
</tr>

<c:choose>
<c:when test="${sessionScope.list != null}">
<c:forEach var="b" items="${sessionScope.list}">
<tr>
<td>${b.getId()}</td>
<td>${b.getTitle()}</td>
<td>${b.getAuthor()}</td>
<td>${b.getPrice()}</td>
<td><a href="views/updateBook.jsp?id=${b.getId()}">Edit</a></td>
<td>Delete</td>
</tr>
</c:forEach>
</c:when>
<c:otherwise>
Invalid
</c:otherwise>
</c:choose>


</table>
</body>
</html>