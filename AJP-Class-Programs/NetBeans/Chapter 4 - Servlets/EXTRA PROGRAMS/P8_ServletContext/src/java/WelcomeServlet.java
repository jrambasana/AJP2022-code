import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeServlet extends HttpServlet {

public void doPost(HttpServletRequest req, 
        HttpServletResponse res) 
        throws IOException, ServletException
{
res.setContentType("text/html");
PrintWriter out = res.getWriter();
ServletContext sc = getServletContext();
out.println("<h1> Welcome " + sc.getInitParameter("uname") + "</h1>");
out.println("<h3> <a href='profile'>My Profile</a> </h3>");
}

}
