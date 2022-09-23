<%-- 
Program 9: Write down a program which demonstrates the Function tag of JSTL.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Program 9: JSTL Function Tag</title>
</head>
<body>
    <h1>JSP Program 9: JSTL Function Tag Example</h1>
    <c:set var="string" value="Welcome to the JSTL Function Tag Example"/>  
    ${fn:toLowerCase("HELLO, ")}    <br/>
    ${fn:toUpperCase(string)}       <br/>
    ${fn:substring(string, 11, 18)} <br/>
    <c:set var="user" value="Jack Pack"/>  
    This page is developed by ${fn:toUpperCase(user)} <br/>
    This page is developed by ${fn:replace(user, "Jack", "Pack")}
</body>
</html>
