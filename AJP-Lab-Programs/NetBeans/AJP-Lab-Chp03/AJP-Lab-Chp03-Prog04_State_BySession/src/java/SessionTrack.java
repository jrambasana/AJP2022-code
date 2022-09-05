import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
 
public class SessionTrack extends HttpServlet {
public void doGet(HttpServletRequest request,
                  HttpServletResponse response)
          throws ServletException, IOException
{
    // Create a session object if it is already not  created.
    HttpSession session = request.getSession(true);

    String title = "Welcome Back to my website";
    Integer visitCount = 1;
    String un = new String("ABCD");
    // Check if this is new commer on your web page.
    if (session.isNew()){
       title = "Welcome to my website";
       session.setAttribute("un",un);
    } else {
       visitCount = (Integer)session.getAttribute("visitCount");
       visitCount = visitCount + 1;
    }
    session.setAttribute("visitCount",  visitCount);
            

    // Set response content type
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("<h1>"+title+"</h1>");
    out.println("<h3>");    
    out.println("<br>Welcome "+(String)session.getAttribute("un"));
    out.println("<br>Your visitor number is: "+visitCount);
    out.println("<br>Session id: "+session.getId());
    out.println("<br>Session creation time: "+new Date(session.getCreationTime()));
    out.println("<br>Session last access time: "+new Date(session.getLastAccessedTime()));
    out.println("<br>Click here to go to <a href='page2'>Page 2</a>.");
    out.println("</h3>");  
    

    
}
}