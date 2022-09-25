<%-- 
    Document   : jsp_page-directive_session
    Created on : Feb 20, 2018, 7:52:22 AM
    Author     : heman
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" session="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Accessing Session Attributes using Page Directives</h1>
        Current Session ID is :<%= session.getId() %>
    </body>
</html>
