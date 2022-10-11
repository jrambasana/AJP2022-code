<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP Scriptlets - Declaration Tag</title>
    </head>
    <body>
        <h1>JSP Simple Scriptlet Tag</h1>
        <%! int data=50; %>
        <%! java.util.Date today = new java.util.Date(); %>

        <%= "Welcome to JSP" %>
        Today's date: <%= today %>
        <%= "Value of the variable is:"+data %>  
    </body>
</html>
