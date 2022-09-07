import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionServlet2 extends HttpServlet {
protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();

    HttpSession session = request.getSession(false);
    if(session!=null)
    {
//        User u2 = (User)session.getAttribute("user");
//        out.println("<br/>Welcome back " + u2.username);
//        out.println("<br/>Session creation Time: " + u2.creationTime);
//        u2.lastAccessedTime = new Date(session.getLastAccessedTime());
//        out.println("<br/>Session last accessed Time: " + u2.lastAccessedTime);
        String username = (String)session.getAttribute("username");
        out.println("Welcome back " + username);
    }
    else
    {
        out.println("User not logged in.");
    }
}
}
