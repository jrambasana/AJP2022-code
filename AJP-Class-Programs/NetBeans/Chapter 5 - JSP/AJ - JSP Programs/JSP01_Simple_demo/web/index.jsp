<%-- Write down the Program which displays the simple JSP file.--%>
<%@page contentType="text/html" import="java.util.*" %>
<!DOCTYPE html>
<html>
<%! 
    int a=0;     String name="testuser"; 
%>
<body>
 <h1>  <% out.print("Welcome to JSP");%> </h1>
 Name is = <%= name %> <br>
 <%     
    Date dt = new Date();    
    out.println(dt);     
 %>
<br> 
Value of a = <%= ++a %>
</body> </html>

