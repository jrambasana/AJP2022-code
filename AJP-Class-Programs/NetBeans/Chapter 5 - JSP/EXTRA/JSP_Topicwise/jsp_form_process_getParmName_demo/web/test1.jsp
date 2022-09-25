<%-- 
    Document   : test1
    Created on : Feb 17, 2018, 9:53:42 AM
    Author     : heman
--%>

<%@page import="java.util.Enumeration"%>
<%
	String ParameterNames = "";
	for(Enumeration e = request.getParameterNames(); e.hasMoreElements(); )
        {
		ParameterNames = (String)e.nextElement();
		out.println(ParameterNames + "<br/>");
	}
%>