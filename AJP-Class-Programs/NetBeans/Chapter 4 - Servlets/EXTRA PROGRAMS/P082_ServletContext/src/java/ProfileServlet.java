import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProfileServlet extends HttpServlet {
public void doGet(HttpServletRequest req, 
        HttpServletResponse res) 
        throws IOException, ServletException
{
res.setContentType("text/html");
PrintWriter out = res.getWriter();

ServletContext sc = getServletContext();
out.println("<h1> Welcome " + sc.getInitParameter("uname") + "</h1>");
out.println("<h1> Your password: " + sc.getInitParameter("pwd") + "</h1>");
out.println("<h1> Department:  " + sc.getInitParameter("dept") + "</h1>");
out.println("<h1> Institute: " + sc.getInitParameter("inst") + "</h1>");
out.println("<h1> City: " + sc.getInitParameter("city") + "</h1>");
}

}
