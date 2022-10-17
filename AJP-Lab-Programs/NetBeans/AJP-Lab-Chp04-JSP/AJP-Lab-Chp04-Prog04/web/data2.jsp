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
        ResultSet rs = st.executeQuery("select * from student where no = " 
                                        + request.getParameter("no"));
    %>
        <table border="1">
        <tr>
            <th>Enrollment no.</th>
            <th>Name</th>
            <th>Physics</th>
            <th>Chemistry</th>
            <th>Mathematics</th>
            <th>Overall</th>
        </tr>
    <%
        while(rs.next())
        {
    %>
            <tr>
            <td> <%= rs.getInt(1) %> </td>
            <td> <%= rs.getString(2) %> </td>
            <td> <%= rs.getInt(3) %> </td>
            <td> <%= rs.getInt(4) %> </td>
            <td> <%= rs.getInt(5) %> </td>
            <td> <%= rs.getDouble(6) %> </td>
            </tr>
    <%    
        }
    %>
        </table>
</body>
</html>
