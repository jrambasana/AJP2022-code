
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ParamServlet2 extends HttpServlet 
{
public void doGet(HttpServletRequest req,HttpServletResponse res) 
    throws IOException, ServletException
{
    res.setContentType("text/html");
    PrintWriter out = res.getWriter();
    
    String name = req.getParameter("username");
    String password = req.getParameter("password"); 
    
    ServletContext sc = getServletContext();
    if(name.equals(sc.getInitParameter("uname"))  && 
        password.equals(sc.getInitParameter("pwd")))
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
