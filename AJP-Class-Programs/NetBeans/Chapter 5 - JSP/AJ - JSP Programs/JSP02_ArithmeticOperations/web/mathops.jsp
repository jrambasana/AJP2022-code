<%--
Write down the program in which input the two numbers in an html 
file and then display the basic mathematic operations in JSP file.
--%>
<%@page contentType="text/html" errorPage="error.jsp"%>
<html> <body>
<%
 int x = Integer.parseInt(request.getParameter("n1"));
 int y = Integer.parseInt(request.getParameter("n2"));
%>
<b>
 <br/>
    <%= "Addition result: " + (x+y) %>
 <br/>
    <%= "Subtraction result: "+ (x-y) %>
 <br/>
    <%= "Multiplication result: "+ (x*y) %>
 <br/>
    <%= "Division result: "+ (x/y) %>
</b>
</body>  </html>
