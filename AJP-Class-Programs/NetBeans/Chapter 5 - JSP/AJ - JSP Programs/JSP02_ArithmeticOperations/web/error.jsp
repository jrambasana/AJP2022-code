<%@page contentType="text/html" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<body>
<h1>Ooopss...</h1>
<pre>
 The Error is: <%= exception.getMessage()%>
</pre>
<% exception.printStackTrace(response.getWriter()); %>
</body>
</html>
