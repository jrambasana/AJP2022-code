<%-- 
Program 2:  Write a program in which you can input two numbers in an
html file and then display the addition in JSP file
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Program 2</title>
</head>
<body>
    <h2>This is JSP Program 2.</h2>
    <p>It does addition of two parameters sent in request from an HTML file.</p>
    <p>
        <%
            String n1 = request.getParameter("no1");
            String n2 = request.getParameter("no2");             
            int a1= Integer.parseInt(n1);
            int a2= Integer.parseInt(n2);
            int result = a1+ a2;            
            out.print("Addition of " + a1 + " & " + a2 + " is " + result);
        %>
    </p>
</body>
</html>
