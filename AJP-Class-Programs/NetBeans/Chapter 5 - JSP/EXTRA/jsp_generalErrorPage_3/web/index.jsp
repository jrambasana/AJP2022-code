<%-- 
    Document   : index
    Created on : Feb 16, 2018, 2:02:57 AM
    Author     : heman
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" errorPage="common_errorpage.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
   // Throw an exception to invoke the error page
   int x = 1;
   if (x == 1)
   {
      throw new RuntimeException("<u><b> Error condition!! </b></u>");
   }
%>
        
    </body>
</html>
