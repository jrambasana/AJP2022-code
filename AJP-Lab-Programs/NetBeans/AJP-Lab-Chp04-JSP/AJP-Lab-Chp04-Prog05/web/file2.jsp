<%-- 
Program 5:  Write a Program for testing the include action tag in JSP.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Program 5: Include Action Tag</title>
    </head>
    <body>
        <h1>JSP File</h1>
        <p>This output is from the <b>JSP File</b>.</p>
        <p>
            Today's date:- <%= new java.util.Date()%> 
            <%= new java.util.Date().getMonth()%>
            <%= new java.util.Date().getYear()%>
        </p>
        <p>
            Time:- <%= new java.util.Date().getHours()%> 
             : <%= new java.util.Date().getMinutes()%>
             : <%= new java.util.Date().getSeconds()%>
        </p>
        <hr/>
    </body>
</html>
