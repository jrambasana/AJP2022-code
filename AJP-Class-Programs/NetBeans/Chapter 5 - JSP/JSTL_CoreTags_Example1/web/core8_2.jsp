<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Core Tag Example</title>
</head>
<body>
<c:set var="url2" value="${param.url1}" scope="session"/>
<c:out value="${url2}"/>
<c:redirect url="${url2}"/>
</body>  
</html>  

</body>
</html>
