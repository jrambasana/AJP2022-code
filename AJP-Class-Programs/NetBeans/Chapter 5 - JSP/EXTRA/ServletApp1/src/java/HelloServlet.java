import java.io.*;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.http.*;
public class HelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h3>Welcome to My First Servlet</h3>");
        out.println("Date and Time: " + (new Date()) );
    }
}
