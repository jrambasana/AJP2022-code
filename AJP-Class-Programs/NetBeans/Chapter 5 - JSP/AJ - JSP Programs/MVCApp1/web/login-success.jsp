<%@page import="com.javatpoint.User"%>

<p>You are successfully logged in!</p>
<%
    User bean=(User)request.getAttribute("user");
    session.setAttribute("user", bean);
%>
<h1>Welcome, <%= bean.getName() %> </h1>
<h3>Your city <%= bean.getCity() %> is a great city.</h3>
    
