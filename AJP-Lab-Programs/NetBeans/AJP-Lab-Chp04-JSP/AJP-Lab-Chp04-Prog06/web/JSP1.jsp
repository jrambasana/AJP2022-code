<%-- 
Program 6:  Write a Program for testing the forward action tag.  
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Program 6: Forward Action Tag</title>
</head>
<body>
    <h1>JSP Program 6: Forward Action Tag</h1>
    <h2>JSP Page 1</h2>
    <jsp:forward page = "JSP2.jsp" >
        <jsp:param name="name" value="Jack Pack" /> 
        <jsp:param name="no" value="9123456789" />
        <jsp:param name="branch" value="Information Technology" />
        <jsp:param name="mail" value="jack.pack@marwadiuniversity.ac.in" />
    </jsp:forward>         
</body>
</html>
