import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class ServletConfigDemo extends HttpServlet 
{
public void doGet(HttpServletRequest req,HttpServletResponse res)
{
    try {
    res.setContentType("text/html");
    PrintWriter out=res.getWriter();

    //creating servletContext
    ServletConfig context = getServletConfig();

    //getting value of the initialization parameter and printing it
    String db=context.getInitParameter("dbName");
    out.println("Database Name = "+db);
    }
    catch(Exception e){
    System.out.println(e);
    }
}
}
