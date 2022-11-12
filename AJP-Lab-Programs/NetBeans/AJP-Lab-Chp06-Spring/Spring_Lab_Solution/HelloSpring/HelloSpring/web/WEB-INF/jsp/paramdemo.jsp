
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>@RequestParam Demo</h3>
        <fieldset>
            <legend>Results</legend>
            ID: ${id}
            <br/>
            Other: ${other}
        </fieldset>
        
        <p>
            <a href="paramdemo1?id=2&other=otherParam">/paramdemo1?id=2&AMP;other=otherParam</a>
            <br/>
            /paramdemo1 will be called. Both parameters required, both parameters passed in
        </p>
        <hr />
        <p>
            <a href="paramdemo1?id=2">/paramdemo1?id=2</a>
            <br/>
            /paramdemo1 will not be called. Both parameters required, one or more parameters not passed in. 
            This will result in a HTTP 400 error
        </p>
        <hr/>
        <hr/>
        <hr/>
        
        <p>
            <a href="paramdemo2?id=2&other=otherParam">/paramdemo2?id=2&AMP;other=otherParam</a>
            <br/>
            /paramdemo2 will be called. Both parameters passed in
        </p>
        <hr />
        <p>
            <a href="paramdemo2?id=2">/paramdemo2?id=2</a>
            <br/>
            /paramdemo2 will be called. One required parameter passed in, second optional parameter not passed in
        </p>
        <hr/>
        <p>
            <a href="paramdemo2">/paramdemo2</a>
            <br/>
            /paramdemo2 will not be called. One required parameter is not passed in. 
            This will result in a HTTP 400 error
        </p>
        
    </body>
</html>
