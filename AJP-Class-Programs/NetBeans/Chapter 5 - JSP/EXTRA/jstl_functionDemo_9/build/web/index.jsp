<%-- 
    Document   : index
    Created on : Feb 16, 2018, 3:30:11 AM
    Author     : heman
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>example showing JSTL functions</title></head>
<body>
<h2>Using various JSTL 1.2 functions</h2><br></br>
<h3>Test String :Example showing usage of JSTL functions</h3>

<c:set var="v1" value="Example showing usage of JSTL functions"/>
The length of the test String: ${fn:length(v1)}<br />

Does the test String contain "JSTL"? ${fn:contains(v1,"JSTL")}<br />

Putting the String into upper case using fn:toUpperCase(): ${fn:toUpperCase(v1)}<br />

Splitting the String into a String array using fn:split(), and returning the array length: ${fn:length(fn:split(v1," "))}<br />

</body>
</html>