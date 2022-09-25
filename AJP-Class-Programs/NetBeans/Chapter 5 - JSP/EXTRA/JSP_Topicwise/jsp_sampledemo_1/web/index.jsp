<%-- 
    Document   : index
    Created on : Feb 28, 2018, 7:37:21 AM
    Author     : student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*" %>
<%! int a=10; String name="testuser"; %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <% out.println("Welcome to the world of JSP");%>
        Value of a = <%= a %> <br>
        Name is = <%= name %> <br>
    </body>
</html>

<%
    Date dt = new Date();
    out.println(dt);
    
%>