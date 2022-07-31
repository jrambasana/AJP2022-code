import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LifeCycleServlet extends HttpServlet {

    public void init()throws ServletException {
        System.out.println("Life Cycle Servlet - Life started");
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
                        throws ServletException, IOException 
    {
        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();
        System.out.println("Life Cycle Servlet Requested");
        out.println("<h1>Hello World from Life Cycle Servlet</h1>");
    }

    public void destroy() {
        System.out.println("Life Cycle Servlet - Life Ended");
    }

}
