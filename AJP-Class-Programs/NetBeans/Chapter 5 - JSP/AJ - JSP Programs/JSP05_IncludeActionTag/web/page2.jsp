<%@page contentType="text/html" %>
<!DOCTYPE html>
<html>
<head> <title>Page 2</title> </head>
<body>
  <h1> Page 2 </h1>
  <b>Welcome, </b> 
  <%= request.getParameter("user") %>
  <br/>
  <b>Department: </b> 
  <%= request.getParameter("dept") %>
</body>
</html>
