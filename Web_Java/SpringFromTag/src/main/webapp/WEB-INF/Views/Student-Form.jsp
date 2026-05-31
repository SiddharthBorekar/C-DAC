<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student-Forrm</title>
</head>
<body>
	<form action="processform" method="post" modelAttribute="theStudent"></form>
	<table>
	<tr> 
	<td> Enter FirstName </td>
	<td> <form:input path="FirstName"/> </td>
	</tr>
	
	<tr> 
	<td> Enter LastName </td>
	<td> <form:input path="LastName"/> </td>
	</tr>

	<td>Select Country</td>
	<td> 
	<form:select path="Country">
	<form:options items="${therStudent.CountryOptions}"/>
	</form:select>
	</td>
	</tr>
	
	<tr>
	<td>Select Favorite Language</td>
	<td>Java <form:radiobutton path="Favoritelanguage" value="Java"></form>
	<td>Spring <form:radiobutton path="Favoritelanguage" value="Spring"></form>
	<td>SpringBoot <form:radiobutton path="Favoritelanguage" value="SpringBoot"></form>
	</tr>
	</table>
</body>
</html>