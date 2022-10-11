<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP Page</title>
    </head>
    <body>
    <%
        String name = request.getParameter("uname");
        out.print("Welcome "+name);
    %>     
    </body>
</html>
