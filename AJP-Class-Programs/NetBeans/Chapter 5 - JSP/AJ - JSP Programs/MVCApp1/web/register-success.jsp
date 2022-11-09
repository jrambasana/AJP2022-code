<%@page import="com.javatpoint.User"%>

<p>You are successfully registered!</p>
<%
User bean=(User)request.getAttribute("user");
%>
<h1>Welcome, <%= bean.getName() %> </h1>
<h3>Your city <%= bean.getCity() %> is a great city.</h3>
<p>You can now Login to the Wesite using below Login form.</p>
<%@ include file="index.jsp" %>
