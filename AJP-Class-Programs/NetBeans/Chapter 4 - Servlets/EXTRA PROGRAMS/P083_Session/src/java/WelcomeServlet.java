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

public class WelcomeServlet extends HttpServlet {

public void doGet(HttpServletRequest req, 
        HttpServletResponse res) 
        throws IOException, ServletException
{
res.setContentType("text/html");
PrintWriter out = res.getWriter();
HttpSession s = req.getSession(false);
if(s != null)
{
 out.println("<h1> Welcome " + s.getAttribute("uname") + "</h1>");
 out.println("<h3> <a href='profile'>My Profile</a> </h3>");
}
else
{
 out.println("<h1> Login Error </h1>");
 RequestDispatcher rd = req.getRequestDispatcher("/index.html");
 rd.include(req, res);
}

}
}
