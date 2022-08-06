import java.io.*;
import java.util.*;
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet{
	
public void doGet(HttpServletRequest req,HttpServletResponse res)
{
    try {
    res.setContentType("text/html");
    PrintWriter out=res.getWriter();

    out.println("<html>");
    out.println("<head>");
    out.println("<title>First Servlet </title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h3>Welcome to My First Servlet</h3>");
    out.println("Date and Time: " + (new Date()) );
    out.println("</body>");
    out.println("</html>");
    }
    catch(Exception e){
    System.out.println(e);
    }
}
	
}