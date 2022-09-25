<%-- getParameterNames() method demo --%>
<!-- Files used test.jsp & test1.jsp -->

<%@page import="java.util.*" %>

<html>
	<head><title>getParameterNames() method of request object.</title></head>

	<body>
		<form method="post" action="test1.jsp">
			<table border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td>User Name: </td>
					<td><input type="text" size="20" name="txtUserName" />
				</tr>
				<tr>
					<td>Password: </td>
					<td><input type="password" size="20" name="txtPassword" />
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td><input type="submit" value="Submit"  /></td>
				</tr>
			</table>
		</form>
		
	</body>
</html>