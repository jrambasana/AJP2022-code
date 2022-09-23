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
        <!--center-->
        <h1>JSP Program 5: Include Action Tag</h1>
        <h3>This page includes two other files (1 HTML and 1 JSP)</h3>        
        <hr/>
         <jsp:include page = "file1.html" />
         <jsp:include page = "file2.jsp" />
        <!--/center-->
    </body>
</html>
