<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head><title>Hello World</title></head>
<body>
<h1>Hello World!</h1>
<%
    out.println("Your IP address is " + request.getRemoteAddr());
%>
</body>
</html>

