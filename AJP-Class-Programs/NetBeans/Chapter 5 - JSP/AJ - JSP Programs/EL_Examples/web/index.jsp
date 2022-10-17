<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
<h3>welcome to index page</h3>  
<%  
    Cookie ck=new Cookie("user","abhishek");  
    response.addCookie(ck);  
    session.setAttribute("user","sonoo");  
%>  
<a>Expression is:</a> ${1+2}; 
<form action="process.jsp">  
    Enter Name:<input type="text" name="name" /><br/>
    Enter Age: <input type="text" name="age" /><br/>  
<input type="submit" value="go"/>  
</form>  
<br>

<h1>First JSP</h1>  
 


<a href="process.jsp">visit</a>  

</body>
</html>
