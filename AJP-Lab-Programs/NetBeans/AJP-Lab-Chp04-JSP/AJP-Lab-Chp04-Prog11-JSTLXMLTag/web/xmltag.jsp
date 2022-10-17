<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<html>
<head>    
    <title>XML Demo</title>
</head>
<body>
<h1>XML Demo</h1>
<c:import url="books.xml" var="book"/>
<x:parse xml="${book}" var="parsed"/>
Details of the Books from XML file are as follows:
<table border="1">
<tr>
    <th>Title of the Book</th>
        <td width="1%"> </td>
    <th>Description</th>
        <td width="1%"> </td>
    <th>Author of the Book</th>
        <td width="1%"> </td>
    <th>Price</th>
</tr>
<x:forEach select="$parsed//books/book">
<tr>
    <td><x:out select="title"/></td>
        <td width="1%"> </td>
    <td><x:out select="description"/></td>
        <td width="1%"> </td>
    <td><x:out select="author"/></td>
        <td width="1%"> </td>
    <td><x:out select="price"/></td>
</tr>
</x:forEach>
</table>
</body>
</html>

