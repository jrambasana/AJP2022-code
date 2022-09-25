<%-- 
    Document   : index
    Created on : Mar 3, 2018, 9:30:30 AM
    Author     : home
--%>

<%@ page errorPage="ShowError.jsp" %>

<html>
<head>
   <title>Error Handling Example</title>
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