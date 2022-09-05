import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class ThirdServlet extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response)
{
    try {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
    
        Cookie ck = new Cookie("uname","");
        ck.setMaxAge(0);
        response.addCookie(ck);
        
        out.println("Cookie is deleted.");
    }
    catch(Exception e)
    {        System.out.println(e);    }
}
}
