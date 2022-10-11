<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<html>  
<head>  
<title>Core Tag Example</title>  
</head>  
<body>  
<c:set var="n1" value="${100}"/>  
<c:set var="n2" value="${200}"/>  
<c:set var="n3" value="${150}"/>  

<c:choose>  
    <c:when test="${n1 > n2 && n1 > n3}">  
        Number 1 <c:out value="${n1}"/> is Greatest
    </c:when>  
    <c:when test="${n2 > n1 && n2 > n3}"> 
       Number 2 <c:out value="${n2}"/> is Greatest
    </c:when>   
    <c:otherwise>  
       Number 3 <c:out value="${n3}"/> is Greatest
    </c:otherwise>  
</c:choose>  
</body>  
</html>  