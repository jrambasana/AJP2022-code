<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<html>  
<head>  
<title>Core Tag Example</title>  
</head>  
<body>  
<c:set var="Income" scope="session" value="${4000*4}"/>  
<c:out value="${Income}"/>  
<a href="page3.jsp">page3</a>
</body>  
</html>  