<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>JSP Form Processing Example</h1>
        FIRSTNAME: <%= request.getParameter("fname") %> <br>
        LASTNAME:  <%= request.getParameter("lname") %>
    </body>
</html>
