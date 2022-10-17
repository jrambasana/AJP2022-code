<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Core Tag Example</title>
</head>
<body>
<c:forEach var="j" begin="1" end="10">
    <c:choose>
    <c:when test="${j%2 == 0}">
        The number ${j} is Even. <br/>
    </c:when>
    <c:otherwise>
        The number ${j} is Odd. <br/>
    </c:otherwise>
    </c:choose>
</c:forEach>
</body>
</html>
