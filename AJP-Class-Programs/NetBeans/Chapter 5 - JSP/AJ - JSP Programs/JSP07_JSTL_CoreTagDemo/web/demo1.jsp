<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" 
           prefix="c" %>  
<!DOCTYPE html>
<html>
<body>
<c:set var="n1" value="${100}" />  
<c:set var="n2" value="${300}" />  
<c:set var="n3" value="${400}" />

<c:if test="${n1>n2 && n1>n3}">  
    <p> <c:out value="${n1}" /> is greatest<p>  
</c:if>  

<c:if test="${n2>n1 && n2>n3}">  
   <p><c:out value="${n2}" /> is greatest<p>  
</c:if> 

<c:if test="${n3>n1 && n3>n2}">  
   <p><c:out value="${n3}" /> is greatest<p>  
</c:if>     

</body>
</html>
