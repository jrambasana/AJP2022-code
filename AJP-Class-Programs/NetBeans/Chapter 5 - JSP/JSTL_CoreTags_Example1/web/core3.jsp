<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSTL Page</title>
</head>
<body>
    <c:set var="income" scope="session" value="${4000*4}"/>
    <p>Before Remove Value is: <c:out value="${income}"/></p>
    <c:remove var="income"/>
    <p>After Remove Value is: <c:out value="${income}"/></p>
</body>
</html>
