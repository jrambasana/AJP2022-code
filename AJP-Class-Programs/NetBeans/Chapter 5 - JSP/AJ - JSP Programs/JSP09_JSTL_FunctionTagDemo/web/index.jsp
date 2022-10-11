<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head> <title>JSTL Function Tags</title> </head>
<body>
<h2>Using various JSTL 1.2 functions</h2>
<h3>Test String : <u>Example String showing usage of JSTL functions</u></h3>

<c:set var="var" value="Example String showing usage of JSTL functions"/>
<br/>
The length of the test String: ${fn:length(var)}
<br/>
Does the test String contain "JSTL"? ${fn:contains(var,"JSTL")}
<br/>
Converting the String into upper case using fn:toUpperCase(): ==> ${fn:toUpperCase(var)}
<br/>
Splitting the String into a String array using fn:split(), and returning the array length:  ==> ${fn:length(fn:split(var," "))}
<br/>

</body>
</html>