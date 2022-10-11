import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class SessionServlet2 extends HttpServlet {
public void doGet(HttpServletRequest request,
                  HttpServletResponse response)
          throws ServletException, IOException
{
    HttpSession session = request.getSession(false);
    
    // Set response content type
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    
    out.println("<h3>");    
    out.println("<br>Welcome "+session.getAttribute("un"));
    out.println("<br>Your visitor number is: "+session.getAttribute("visitCount"));
    out.println("</h3>");  
}
}