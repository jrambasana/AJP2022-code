<%@page contentType="text/html" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" 
          prefix="c" %>
<!DOCTYPE html>
<html>
<c:out value="${'<b>An <c:out> example </b>'}"/>
<br/>
<c:out value="${'<b>Second <c:out> example </b>'}" 
       escapeXml="false"/>
<br/>
<c:set var="className" scope="application" 
       value="6th CE / IT"/>
<a href="display.jsp">Display</a>
<br/>
<c:set var="age" value="26"/>
<c:if test="${age >= 18}">
    <c:out value="Eligible for voting!"/>
</c:if>

<c:if test="${age < 18}">
    <c:out value="NOT Eligible for voting!"/>
</c:if>

<c:set var="number1" value="${222}"/>
<c:set var="number2" value="${12}"/>
<c:set var="number3" value="${10}"/>
<br/>
<c:choose>
    <c:when test="${number1 < number2}">
        ${"number1 is less than number2"}
    </c:when>
    <c:when test="${number1 <= number3}">
        ${"number1 is less than equal to number2"}
    </c:when>
    <c:otherwise>
        ${"number1 is largest number!"}
    </c:otherwise>
</c:choose>
<br/>

<%!
    int num1 = 10;
    int num2 = 0;%>
<c:catch var ="errormsg">
    <%
        int res = num1 / num2;
        out.println(res);
    %>
</c:catch>
<br/>

<c:forEach var="counter" begin="1" end="10">
    <c:out value="${counter}"/>
</c:forEach><br/>

<c:forTokens items="www.beginnersbook.com" 
             delims="." var="site">
    <c:out value="${site}"/> <br/>
</c:forTokens><br/>
</html>
