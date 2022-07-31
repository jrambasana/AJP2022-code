
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class SessionServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, 
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
     HttpSession s = req.getSession();
     s.setAttribute("uname", sc.getInitParameter("uname"));
     s.setAttribute("pwd", sc.getInitParameter("pwd"));
     s.setAttribute("dept", sc.getInitParameter("dept"));
     s.setAttribute("inst", sc.getInitParameter("inst"));
     s.setAttribute("city", sc.getInitParameter("city"));
     
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
