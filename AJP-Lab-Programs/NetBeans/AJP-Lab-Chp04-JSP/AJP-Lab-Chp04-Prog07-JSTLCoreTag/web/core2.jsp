<%-- 
Program 7: Write a program which demonstrates the core tag of JSTL.  
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<br/>Core 2 JSP Output: <br/>
<c:out value="${Site}"/> <br/> 
<c:out value="${author}" default="Book has no author"/>