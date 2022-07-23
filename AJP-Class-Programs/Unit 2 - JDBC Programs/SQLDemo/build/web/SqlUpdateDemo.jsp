<%@ page import="java.io.*,java.util.*,java.sql.*"%>  
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>  
  
<html>  
<head>  
<title>sql:query Tag</title>  
</head>  
<body>  
   
      
    <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
    url="jdbc:mysql://localhost/mefgi"  
     user="root"  password=""/>  
        <sql:update dataSource="${db}" var="newStudent">
            INSERT into STUDENTS (id,First_name, Last_name,Age) values(?,?,?,?);
            <sql:param value="${param.id}" />
            <sql:param value="${param.fname}" />
            <sql:param value="${param.lname}" />
              <sql:param value="${param.age}" />
        </sql:update>

            <c:import url="SqlQueryDemo.jsp"/>
  
  
</body>  
</html>  
