<%@ page import="com.User" %>  
<% 
User u = new User();
u.setUsername(request.getParameter("username"));
u.setPassword(request.getParameter("password"));
u.setAge(Integer.parseInt(request.getParameter("age")));
%>
<br> 

You have entered below details:
<br> 
Username: <%= u.getUsername() %> 
<br> 
Password: <%= u.getPassword()%> 
<br> 
Your Age: <%= u.getAge() %> 

<%--<jsp:getProperty property="age"      name="userinfo" />--%>

</html>
