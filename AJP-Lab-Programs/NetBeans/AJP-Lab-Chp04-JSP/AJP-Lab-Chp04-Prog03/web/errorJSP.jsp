<%-- 
Program 3:  Write down a JSP program which will display the error 
by a common file for all the general pages.
<%@page isErrorPage="true" %>  
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true" %>  

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Program 3: ERROR CALCULATION</title>
    </head>
    <body>
        <h1>JSP Program 3: ERROR CALCULATION</h1>
        <h3>Sorry exception has occurred.</h3>  
        <p>Exception is: <b><%= exception %></b> </p>
    </body>
</html>
