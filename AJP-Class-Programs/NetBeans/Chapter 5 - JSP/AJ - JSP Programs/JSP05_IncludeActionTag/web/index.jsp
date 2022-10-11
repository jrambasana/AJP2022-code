<%@page contentType="text/html" %>
<!DOCTYPE html>
<html>
<head> <title>Include Example</title> </head>
<body>
<h1> Before Include </h1>
<jsp:include page="page2.jsp">
    <jsp:param name="user" value="ABC" />
    <jsp:param name="dept" value="Computer" />
</jsp:include>    
<h1> After Include </h1>
</body>
</html>
