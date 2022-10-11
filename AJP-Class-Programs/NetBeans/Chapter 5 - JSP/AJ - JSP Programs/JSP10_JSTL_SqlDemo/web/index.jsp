<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/sql_rt" prefix="sql" %>
<sql:setDataSource var="db" 
    driver="com.mysql.jdbc.Driver" 
    url="jdbc:mysql://localhost:3306/test"
    user="root"  password=""/>
<sql:query var="students" dataSource="${db}">
	SELECT id, name, roll_no FROM students
</sql:query>
<!DOCTYPE html>
<html>
<head>
<title>Accessing Database using JSTL</title>
</head>
<body>
    <h2> Records Available in the Database</h2>
    <table border="1">
    <tr>
        <th>ID</th> <th>Name</th> <th>Roll No</th>
    </tr>
    <c:forEach varStatus="status" items="${students.rows}" 
               var="row"> 
    <tr>
        <td> <c:out value="${row.id}" /> </td>
        <td> <c:out value="${row.name}" /> </td>
        <td> <c:out value="${row.roll_no}" /> </td>
    </tr>
    </c:forEach> 
    </table>
</body>
</html>
