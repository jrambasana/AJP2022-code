<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP Implicit Object - out</title>
    </head>
    <body>
        <h1>JSP Implicit Object - out</h1>
        <% out.print("Today is:" + new java.util.Date());%>
    </body>
</html>
