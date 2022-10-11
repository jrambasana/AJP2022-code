<%@page contentType="text/html" %>
<!DOCTYPE html>
<html>
<head> <title>Forward Example</title> </head>
<body>
<h1> Before Forward </h1>
<jsp:forward page="page2.jsp">
    <jsp:param name="user" value="ABC" />
    <jsp:param name="dept" value="Computer" />
</jsp:forward>    
<h1> After Forward </h1>
</body>
</html>
