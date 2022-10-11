<%@page contentType="text/html" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<body>
    <h1> Ooops... Error </h1>
    <pre>
      <% exception.printStackTrace(response.getWriter()); %>
    </pre>
</body>
</html>
