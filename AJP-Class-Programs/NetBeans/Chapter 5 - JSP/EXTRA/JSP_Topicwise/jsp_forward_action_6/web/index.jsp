<%-- 
    Document   : index
    Created on : Feb 28, 2018, 7:52:25 AM
    Author     : student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <h1> before</h1>
        
        <jsp:forward page="second.jsp">
            <jsp:param name="data" value="ABC" />
                
         </jsp:forward>    
    <h1> after</h1>
</html>

