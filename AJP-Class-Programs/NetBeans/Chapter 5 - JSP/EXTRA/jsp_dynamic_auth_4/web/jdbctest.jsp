<%-- 
    Document   : index
    Created on : Feb 26, 2018, 7:40:14 AM
    Author     : heman
--%>

<%@ page import="java.sql.*" %>
<html>
<head></head>
<body>
	<%
		try{
		String u=request.getParameter("un");
		String p=request.getParameter("pw");
		
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection c=DriverManager.getConnection("jdbc:odbc:jspdsn4");
		Statement s=c.createStatement();
		String query="select * from userdata where uname='"+u+"'AND pass='"+p+"'";
		ResultSet rs=s.executeQuery(query);
		
		if(rs.next())
		{
			out.println("Login Successful.");
		}
		else
		{
			out.println("Invalid Credentials.");
		}
        //        rs.close();
      //          s.close();
          //      c.close();
                
		}catch(Exception e){
			out.println(e);
		}
	%>
	
</body>
</html>