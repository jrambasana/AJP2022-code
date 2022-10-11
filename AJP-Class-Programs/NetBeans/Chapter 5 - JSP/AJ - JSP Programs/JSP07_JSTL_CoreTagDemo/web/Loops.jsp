<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<html>  
<head>  
<title>Core Tag Example</title>  
</head>  
<body>  
<c:forEach var="j" begin="1" end="3">  
   Item <c:out value="${j}"/><p>  
</c:forEach>  

<c:forTokens items="Rahul-Nakul-Rajesh" delims="-" var="name">  
   <c:out value="${name}"/><p>  
</c:forTokens>
   
<c:forTokens items="abc,123,pqr,lmn,199" delims="," var="name">  
   <c:out value="${name}"/><p>  
</c:forTokens>

<c:url value="/display.jsp" var="urlName">  
 <c:param name="username" value="ABCD"/>  
 <c:param name="age" value="25"/>  
</c:url>  

<a href="${urlName}">Display</a>  

<c:forEach var="j" begin="1" end="10" step="2">  
    <br> Item <c:out value="${j}"/> 
</c:forEach> 
</body>  
</html>  