import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
public class SendRedirectServlet extends HttpServlet{  
    public void doGet(HttpServletRequest req,HttpServletResponse response)  
    throws ServletException,IOException  
    {  
        response.setContentType("text/html");  
        PrintWriter pw=response.getWriter();  
        response.sendRedirect("http://www.google.com");  
        pw.close();  
    }
}  
