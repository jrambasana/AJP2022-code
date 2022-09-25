<%-- 
    Document   : LoginProcess
    Created on : Feb 16, 2018, 4:03:04 AM
    Author     : heman
--%>

<%@page import="java.sql.*" %>
<html>
<body>
	<% 
	Connection con=null;
	String uname=request.getParameter("uname");
	String pass=request.getParameter("pass");
	try 
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		con=DriverManager.getConnection("jdbc:odbc:jspdirectivedsn");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from userdetails where uname='"+uname+ "' and pass='"+ pass +"'");
		if (!rs.next())
		{ 	

	%>

	User details given for user name : <%=request.getParameter("uname")%> and 
	password : <%=request.getParameter("pass")%> are not valid <br/> Try again 
	<%@include file="Login.html"%>
</body>
</html>

	<% 
			return; 
		}//if
	}//try
	finally 
	{
		try
		{
			con.close();
		}catch(Exception e){}
	}//finally
	%>

	This is a Home Page <br/>
	Welcome, <%=uname%>
</body>
</html>

