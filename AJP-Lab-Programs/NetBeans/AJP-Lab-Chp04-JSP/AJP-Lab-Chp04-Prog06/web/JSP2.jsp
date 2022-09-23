<%-- 
Program 6:  Write a Program for testing the forward action tag.  
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Program 6: Forward Action Tag</title>
    </head>
    <body>
        <h1>JSP Program 6: Forward Action Tag</h1>
        <h2>JSP Page 2</h2>
        <h3>This page shows the parameter data in a request forwarded from JSP Page 1.</h3>
        <p>Student details: <br>
            Name:       <%= request.getParameter("name")%>  <br>
            Enrollment: <%= request.getParameter("no")%>    <br>
            Branch:     <%= request.getParameter("no")%>    <br>
            E-mail:     <%= request.getParameter("mail")%>  <br>
        </p>
    </body>
</html>
