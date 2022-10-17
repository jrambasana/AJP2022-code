<%-- 
Program 7: Write a program which demonstrates the core tag of JSTL.  
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Program 7: JSTL Core Tag</title>
</head>
<body>
    <h1>JSP Program 7: JSTL Core Tag Example</h1>
    Core 1 JSP Output: <br/>
    <c:out value="List of books"/> <br/>
    <c:set var="Site" scope="session" value="New Beginning"/> <br>
    <c:set var="author" scope="session" value="Marwadi"/>
    Site: <c:out value="${Site}"/> <br/>
    Author: <c:out value="${author}"/> <br/>
    <c:remove var="author"/>
    Author: <c:out value="${author}"/> <br/>
    <c:import var="mydata" url="core2.jsp"/>
    <c:out value="${mydata}" escapeXml="false"/>
</body>
</html>
