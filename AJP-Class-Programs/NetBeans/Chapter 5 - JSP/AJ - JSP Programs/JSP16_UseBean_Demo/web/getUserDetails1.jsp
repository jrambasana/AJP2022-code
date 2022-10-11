<%@ page import="com.User" %>  
<% 
User userinfo = new User();
userinfo.setUsername(request.getParameter("username"));
userinfo.setPassword(request.getParameter("password"));
userinfo.setAge(Integer.parseInt(request.getParameter("age")));
%>
<br> 

You have entered below details:
<br> 
Username: <%= userinfo.getUsername() %> 
<br> 
Password: <%= userinfo.getPassword()%> 
<br> 
Your Age: <%= userinfo.getAge() %> 
<%--<jsp:getProperty property="age"      name="userinfo" />--%>

</html>
