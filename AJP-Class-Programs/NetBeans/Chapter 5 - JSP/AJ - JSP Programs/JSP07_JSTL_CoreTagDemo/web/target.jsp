<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Languages</title>
</head>
<body>
<c:forEach items="${paramValues.languages}" 
           var="lang">
    <c:out value="${lang}"/> <br>
</c:forEach>
</body>
</html>