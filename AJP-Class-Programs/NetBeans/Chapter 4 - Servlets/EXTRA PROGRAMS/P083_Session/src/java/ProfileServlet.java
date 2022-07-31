import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ProfileServlet extends HttpServlet {
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
 out.println("<h1> Your password: " + s.getAttribute("pwd") + "</h1>");
 out.println("<h1> Department:  " + s.getAttribute("dept") + "</h1>");
 out.println("<h1> Institute: " + s.getAttribute("inst") + "</h1>");
 out.println("<h1> City: " + s.getAttribute("city") + "</h1>");
}
else
{
 out.println("<h1> Login Error </h1>");
 RequestDispatcher rd = req.getRequestDispatcher("/index.html");
 rd.include(req, res);
}
}

}
