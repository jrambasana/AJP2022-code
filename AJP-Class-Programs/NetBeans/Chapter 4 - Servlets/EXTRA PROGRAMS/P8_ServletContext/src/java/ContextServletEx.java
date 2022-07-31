
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ContextServletEx extends HttpServlet {

public void doPost(HttpServletRequest req, 
    HttpServletResponse res) 
    throws IOException, ServletException
{
    res.setContentType("text/html");
    PrintWriter out = res.getWriter();
    
    String name = req.getParameter("username");
    String password = req.getParameter("password");
   
    ServletContext sc = getServletContext();
    
    if( name.equals(sc.getInitParameter("uname"))   && 
        password.equals(sc.getInitParameter("pwd")) )
    {
     RequestDispatcher rd = req.getRequestDispatcher("/welcome");
     rd.forward(req,res);
    }
    else
    {
     out.println("<h1> Login Error </h1>");
     RequestDispatcher rd = req.getRequestDispatcher("/index.html");
     rd.include(req, res);
    }
}
}
