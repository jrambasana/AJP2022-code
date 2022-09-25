<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Form Processing</title>
    </head>
    <body>
        <h1>JSP Form Processing Example</h1>
	<form action= "demojsp.jsp" method="GET">
            FIRSTNAME: 	<input type="text" name="fname"/> <br>
            LASTNAME:   <input type="text" name="lname"/> <br>
            <input type="submit" value="submit"/>
	</form>
    </body>
</html>
