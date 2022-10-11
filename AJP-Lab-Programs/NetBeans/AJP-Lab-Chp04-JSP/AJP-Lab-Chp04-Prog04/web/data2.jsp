<%-- 
Program 4: Perform Database access through JSP.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Program 4: Database access</title>
</head>
<body>
    <h1>JSP Program 4: Database access example</h1>

    <%@page import="java.sql.*" %>
    <h1>MU RESULT</h1>
    <%
        Class.forName("com.mysql.jdbc.Driver");
        Connection con =
DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from student "
                +"where no = " + request.getParameter("no"));
        out.println("<table border=\"1\">");
        out.println("<tr>");
            out.println("<th>Enrollment no.</th>");
            out.println("<th>Name</th>");
            out.println("<th>Physics</th>");
            out.println("<th>Chemistry</th>");
            out.println("<th>Mathematics</th>");
            out.println("<th>Overall</th>");
        out.println("</tr>");
        while(rs.next())
        {
            out.println("<tr>");
                out.println("<td> "+rs.getInt(1)+" </td>");
                out.println("<td> "+rs.getString(2)+" </td>");
                out.println("<td> "+rs.getInt(3)+" </td>");
                out.println("<td> "+rs.getInt(4)+" </td>");
                out.println("<td> "+rs.getInt(5)+" </td>");
                out.println("<td> "+rs.getDouble(6)+" </td>");
            out.println("</tr>");
        }
    %>
</body>
</html>
