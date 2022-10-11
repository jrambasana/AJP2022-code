<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<html>  
<head>  
<title>Core Tag Example</title>  
</head>  
<body>  
try{ ...... } catch(Exception e){....}  
<c:catch var ="e">  
   <% int x = 2/0;%>  
</c:catch>  
  
<c:if test = "${e != null}">  
   <p>The type of exception is : ${e} <br />  
   There is an exception: ${e.message}</p>  
</c:if>  
  
</body>  
</html>  