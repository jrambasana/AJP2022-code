<%-- 
    Document   : addop
    Created on : Feb 16, 2018, 1:57:13 AM
    Author     : heman
--%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%
            try
            {
                int x=Integer.parseInt(request.getParameter("t1"));
                int y=Integer.parseInt(request.getParameter("t2"));
                out.println("Addition of numbers is "+ (x+y));
            }
            catch(Exception e)
            {
          out.println("You entered invalid number");
            }
        %>

    </body>
</html>
