<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
        <%!
            public int cube(int n)
            {
                return n*n*n;
            }
        %>
        <%= "Cube of 3 is:"+cube(3)%>
    </body>
</html>  
