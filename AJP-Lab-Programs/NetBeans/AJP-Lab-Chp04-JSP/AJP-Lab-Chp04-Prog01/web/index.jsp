<!--
Program 1: Write a simple JSP Program which displays 
the output of a simple JSP file.
-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Program 1</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <h3>This is JSP Program 1.</h3>
        <%= "This tag is used <b>to print data</b>."%>
    </body>
</html>
