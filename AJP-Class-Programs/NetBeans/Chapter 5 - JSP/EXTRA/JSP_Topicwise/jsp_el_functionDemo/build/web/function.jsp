<%-- 
    Document   : index
    Created on : Mar 3, 2018, 9:38:21 AM
    Author     : home
--%>
<%@ taglib prefix="f" uri="/WEB-INF/function-taglib.tld" %>
<html>
<head>
<title>Using EL Functions</title>
</head>
<body>
<h1>Using EL Functions </h1>
The absolute value of \${num} is ${f:abs(-300)}.<br/>
The rounded value of \${calc} is ${f:round(6.666666666666667)}.<br/>


</body>
</html>
