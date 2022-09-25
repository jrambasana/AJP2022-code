<%-- 
    Document   : index
    Created on : Feb 16, 2018, 3:39:14 AM
    Author     : heman
--%>


<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/sql_rt" prefix="sql" %>
<sql:setDataSource var="datasource" 
    driver="sun.jdbc.odbc.JdbcOdbcDriver" url="jdbc:odbc:jstlsqldsn"/>
<sql:query var="students" dataSource="${datasource}">
	SELECT stu_id, stu_name, roll_no FROM student_master 
</sql:query>
<html>
	<head>
		<title>Accessing Database using JSTL</title>
	</head>
	<h2> Records Available in the Database</h2>
	<body>
		<table border="1">
		<tr>
		<td>id</td><td>Name</td><td>Roll_No</td>
		</tr>
		<c:forEach varStatus="status" items="${students.rows}" var="row"> 
		<tr>
		<td><c:out value="${row.stu_id}" /></td>
		<td><c:out value="${row.stu_name}" /></td>
		<td><c:out value="${row.roll_no}" /></td>
		</tr>
		</c:forEach> 
		</table>
	</body>
</html>
