<html>
<body> 
<%
String name=request.getParameter("uname");
out.print("Welcome "+name); 
pageContext.setAttribute("user",name,PageContext.SESSION_SCOPE); 
%>
<a href="second.jsp">second jsp page</a> 

</body> 
</html>