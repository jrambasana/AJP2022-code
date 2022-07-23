<%-- 
    Document   : update
    Created on : 28 Feb, 2019, 1:57:28 AM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>  
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>  

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 3.2 Final//EN">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
<c:if test="${flag < 0 }">  
    <c:out value="inside if"/>
    
    <sql:update var="count" dataSource="${db}">
        delete from student where id= ${request.Parameter("did")};
    </sql:update>
    <c:out value="${count}" />  Records deleted
    
</c:if>
    </body>
</html>
