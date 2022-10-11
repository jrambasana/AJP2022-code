<%--
Write down the program in which display the error 
by common file for all general pages.
--%>
<%@page contentType="text/html" errorPage="errorpage.jsp"%>
<!DOCTYPE html>
<html>  <body>
<%
int x = 1;
if (x == 1)
{ 
  throw new RuntimeException("<u><b> Error condition!! </b></u>");
}
else
{    int n = 4/0;       }
%>  
</body> </html>
