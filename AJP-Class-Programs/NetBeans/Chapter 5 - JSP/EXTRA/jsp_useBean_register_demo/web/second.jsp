<html>
<body> 
<%
String name=pageContext.getAttribute("user",PageContext.SESSION_SCOPE).toString();
out.print("Hello "+name);
%>
</body> 
</html>
