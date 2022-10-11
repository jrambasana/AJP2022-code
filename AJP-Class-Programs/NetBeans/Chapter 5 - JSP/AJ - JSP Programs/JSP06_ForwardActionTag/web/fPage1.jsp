<%@page contentType="text/html"%>
<!DOCTYPE html>
<html>
<head>   <title>JSP Forward Example</title> </head>
<body>
<h1> Before forward </h1>
<jsp:forward page="fPage2.jsp">
    <jsp:param name="data" value="ABC" />
 </jsp:forward>    
<h1> After forward </h1>
</body>
</html>

