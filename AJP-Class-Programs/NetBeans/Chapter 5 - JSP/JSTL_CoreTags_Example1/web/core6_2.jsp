<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Core Tag Example</title>
</head>
<body>
    <c:set var="choice" scope="session" value="101"/>
    <c:choose>
    <c:when test="${choice%2 == 0}">
        The number ${choice} is Even.
    </c:when>
    <c:otherwise>
        The number ${choice} is Odd.
    </c:otherwise>
    </c:choose>
    <c:forEach var="j" begin="1" end="3">
        <p> Item <c:out value="${j}"/> <p/>
    </c:forEach>
</body>
</html>