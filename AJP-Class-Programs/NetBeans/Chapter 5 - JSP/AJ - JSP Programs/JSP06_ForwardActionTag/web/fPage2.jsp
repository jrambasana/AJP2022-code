<%@page contentType="text/html"%>
<!DOCTYPE html>
<html>
<head>
    <title>JSP Page 2</title>
</head>
<body>
    <h1>Second Page</h1>
    <b>Received Parameters = </b>
    <%=request.getParameter("data") %>
</body>
</html>
