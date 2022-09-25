<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP Scriptlets - Expression Tag</title>
    </head>
    <body>
        <h1>JSP Scriptlets - Expression Tag</h1>
        <%= "Welcome to JSP" %>
        Today's date:
        <%= new java.util.Date()%>
        <br>
        <%=java.util.Calendar.getInstance().getTime()%> 
    </body>
</html>
