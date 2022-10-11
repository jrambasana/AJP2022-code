<%-- 
    Document   : sessionEx
    Created on : 28 Sep, 2022, 9:01:10 AM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body> 
<% 
	String name=request.getParameter("uname");
	out.print("Welcome "+name);
	session.setAttribute("user", name); 
%> 
<a href="sessionEx2.jsp">Second JSP page</a> 
</body>
</html>
