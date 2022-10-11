<%@page contentType="text/html" pageEncoding="UTF-8" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP Exception Handling</title>
    </head>
    <body>
        <h1>JSP Exception Handling</h1>
        <%  
            String num1=request.getParameter("n1");  
            String num2=request.getParameter("n2");
            int a=Integer.parseInt(num1);  
            int b=Integer.parseInt(num2);  
            int c=a/b;  
            out.print("Division of numbers is: "+c);  
        %>
    </body>
</html>
