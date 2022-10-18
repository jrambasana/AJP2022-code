<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Core Tag Example</title>
</head>
<body>
    <c:catch var ="catchTheException">
        <%! int x = 2/2;%>
    </c:catch>
    <c:if test = "${catchTheException != null}">
        <p>The type of exception is : ${catchtheException} </p>
    </c:if>
    <c:if test = "${catchTheException == null}">
        <p>Result is : <%= x %></p>
        <p>No exception occurred.</p>
    </c:if>
    <c:set var="income" scope="session" value="${4000*4}"/>
    <p>Var thru EL <%= session.getAttribute("income") %> </p>
    <p>Result is : ${x}</p>
</body>
</html>
