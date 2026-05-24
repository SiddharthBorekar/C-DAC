<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri= "jakarta.tags.core" prefix="c"%>
    <%@ taglib uri= "jakarta.tags.fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Internationalization</title>

<c:set var="theLocale" value="${not empty param.theLocale ? param.theLocale : pageContext.request.locale}" />

<fmt:setLocale value="${theLocale}"/>
<fmt:setBundle basename="com.app.mylabels"/>

</head>
<body>
<a href="index.jsp?theLocale=en_US">English(US)</a>

<a href="index.jsp?theLocale=es_ES">Spanish(ES)</a>

<a href="index.jsp?theLocale=de_DE">German(DE)</a>

<a href="index.jsp?theLocale=mr_IN">Marathi(IN)</a>

<hr>
<fmt:message key="label.greeting"/><br><br>
<fmt:message key="label.firstname"/><i> Siddhant</i><br><br>
<fmt:message key="label.lastname"/><i> Borekar</i><br><br>
<fmt:message key="label.welcome"/><br><br>


<hr>
Selected Locale: ${theLocale}

</body>
</html>