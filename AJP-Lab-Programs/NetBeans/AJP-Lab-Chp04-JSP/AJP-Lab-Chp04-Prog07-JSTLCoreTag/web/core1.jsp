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
        <c:out value="List of books"/><br>
        <c:set var="Site" scope="session" value="New Beginning"/> <br>
        <c:set var="author" scope="session" value="Chaitanya"/>
        <c:remove var="author"/>
        <c:import var="mydata" url="core2.jsp"/>
        <c:out value="${mydata}"/>
    </body>
</html>
