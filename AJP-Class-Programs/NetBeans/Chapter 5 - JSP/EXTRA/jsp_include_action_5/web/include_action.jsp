<%-- 
    Document   : include_action
    Created on : Feb 16, 2018, 2:40:58 AM
    Author     : heman
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <h1> before</h1>
        <jsp:include page="second.jsp">
        
            <jsp:param name="data" value="ABC" />
                
         </jsp:include>    
    <h1> after</h1>
</html>
