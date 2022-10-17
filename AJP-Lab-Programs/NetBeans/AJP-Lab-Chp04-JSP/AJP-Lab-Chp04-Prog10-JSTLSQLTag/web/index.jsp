<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/sql_rt" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
<title>JSTL SQL Tag Demo</title>
</head>
<body>
    <h1>Accessing Database using JSTL SQL Tag</h1>
    <h3>Records Available in the Database</h3>
    <sql:setDataSource var="db" 
        driver="com.mysql.jdbc.Driver" 
        url="jdbc:mysql://localhost:3306/test"
        user="root"  password=""/>
    <sql:query var="student" dataSource="${db}">
            SELECT no, name, overall FROM student
    </sql:query>
    <table border="1">
    <tr>
        <th>No</th> <th>Name</th> <th>Overall %</th>
    </tr>
    <c:forEach varStatus="status" items="${student.rows}" var="row"> 
    <tr>
        <td> <c:out value="${row.no}" /> </td>
        <td> <c:out value="${row.name}" /> </td>
        <td> <c:out value="${row.overall}" /> </td>
    </tr>
    </c:forEach> 
    </table>
</body>
</html>
