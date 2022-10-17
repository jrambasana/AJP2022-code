<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Core Tag Example</title>
</head>
<body>
    <c:set var="choice" scope="session" value="100"/>
    <c:choose>
    <c:when test="${choice <= 10}">
     choice is not good.
    </c:when>
    <c:when test="${choice > 10}">
    choice is very good.
    </c:when>
    <c:otherwise>
     choice is undetermined...
    </c:otherwise>
    </c:choose>
</body>
</html>