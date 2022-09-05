import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionServlet1 extends HttpServlet {
protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();

    HttpSession session = request.getSession(true);

    User u1 = new User();
    u1.username = request.getParameter("username");
    u1.creationTime = new Date(session.getCreationTime());
    u1.lastAccessedTime = new Date(session.getLastAccessedTime());
    session.setAttribute("user", u1);
    out.println("Welcome "+ u1.username);
    out.println("<br/>Session creation Time: " + u1.creationTime);
    out.println("<br/>Session last accessed Time: " + u1.lastAccessedTime);    

//    session.setAttribute("username", request.getParameter("username"));
//    out.println("Welcome "+ request.getParameter("username"));
    out.println("<br/>Username added to Session object.");
    out.println("<a href='page2'>Page 2</a>");
}
}
