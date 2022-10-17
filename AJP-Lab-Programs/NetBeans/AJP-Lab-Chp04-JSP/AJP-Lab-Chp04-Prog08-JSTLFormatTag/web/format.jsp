<%-- 
Program 8: Write down a program which demonstrates the Format tag of JSTL.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Program 8: JSTL Format Tag</title>
</head>
<body>
<h1>JSP Program 8: JSTL Format Tag Example</h1>
<h3>Formatted Details:</h3> 
<c:set var="date1" value="<%=new java.util.Date()%>" />  
<p>  
<b>Formatted Time : </b>  
<fmt:formatDate type="time" value="${date1}" />  
</p>  
<p>  
<b>Formatted Date :</b> 
<fmt:formatDate type="date" value="${date1}" />  
</p>  
<c:set var="date2" value="20-10-2022 12:51:54 PM" />  
<b>Parsed Date :</b> <c:out value="${date2}" />
<fmt:parseDate value="${date2}" var="parsedDate"  
               pattern="dd-MM-yyyy" />  
<p><c:out value="${parsedDate}" /></p>  `
<b>Date & Time : </b> <br/>
Date 1 original format: <c:out value="${date1}" /> <br/>
<p>Date and Time in Indian Standard Time(IST) Zone:
    <fmt:formatDate value="${date1}"  type="both" 
                    timeStyle="long" dateStyle="long" /></p>  
    <fmt:setTimeZone value="GMT-10" />  
<p>Date and Time in GMT-10 time Zone: 
    <fmt:formatDate value="${date1}"  type="both" 
                    timeStyle="long" dateStyle="long" /></p>  
</body>
</html>
