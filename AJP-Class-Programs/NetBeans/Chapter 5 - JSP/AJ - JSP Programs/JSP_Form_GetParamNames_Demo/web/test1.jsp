<%@page import="java.util.Enumeration"%>
<%
String parameterName = "";
Enumeration e = request.getParameterNames();
while( e.hasMoreElements() )
{
    parameterName = (String)e.nextElement();
    out.println(parameterName +" = "
        + request.getParameter(parameterName));
%>
    <br>
<%
}
%>