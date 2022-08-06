import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class WelcomeServlet extends HttpServlet 
{
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
{
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    String user = request.getParameter("user_name");
    out.println("Welcome "+user);
}
}