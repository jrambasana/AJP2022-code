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
out.println("<h2> Your password: " + sc.getInitParameter("pwd") + "</h2>");
out.println("<h3> Department:  " + sc.getInitParameter("dept") + "</h3>");
out.println("<h4> Institute: " + sc.getInitParameter("inst") + "</h4>");
out.println("<h5> City: " + sc.getInitParameter("city") + "</h5>");
}

}
