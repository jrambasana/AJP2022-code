
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p>normal parameter: <blockquote>${helloAgain}</blockquote></p>
        <h3>Person</h3>
        <p>Name: ${personObject.name}</p>
        <p>Age: ${personObject.age}</p>
        
        <p>
            <a href="<%=request.getContextPath()%>/person/Mary">Show Mary</a>
        </p>
        <p>
            <a href="<%=request.getContextPath()%>/person/Jane/28">Show Jane age 28</a>
        </p>
        <p>
            <a href="<%=request.getContextPath()%>/viewdemo">Show Default</a> (Jack, hardcoded in the controller)
        </p>
    </body>
</html>
