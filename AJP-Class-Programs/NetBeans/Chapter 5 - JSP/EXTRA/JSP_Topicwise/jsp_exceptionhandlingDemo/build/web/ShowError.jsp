<%-- 
    Document   : ShowError
    Created on : Mar 3, 2018, 9:32:10 AM
    Author     : home
--%>

<%@ page isErrorPage="true" %>
<html>
<head>
<title>Show Error Page</title>
</head>
<body>
<h1>Opps...</h1>
<p>Sorry, an error occurred.</p>
<p>Here is the exception stack trace: </p>
<pre>
<% 
exception.printStackTrace(response.getWriter()); %>
</pre>
</body>
</html>