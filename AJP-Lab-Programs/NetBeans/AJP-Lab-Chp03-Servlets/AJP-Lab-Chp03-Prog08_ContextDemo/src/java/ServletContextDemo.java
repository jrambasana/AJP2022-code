import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

import java.util.*;

public class ServletContextDemo extends HttpServlet{
public void doGet(HttpServletRequest req,HttpServletResponse res)
{
    try {
    res.setContentType("text/html");
    PrintWriter out=res.getWriter();

    //creating servletContext
    ServletContext context=getServletContext();

    //getting value of the initialization parameter and printing it
    String db=context.getInitParameter("dbDriver");
    out.println("Database Driver = "+db);
    }
    catch(Exception e){
    System.out.println(e);
    }
}	
}