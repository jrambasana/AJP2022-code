import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CookieServlet extends HttpServlet {
protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    
    //Code to Read Cookies
    Cookie ck[] = request.getCookies();
    if (ck != null)
    {
        for(int i=0; i<ck.length ; i++)
        {
            out.println("Cookie Name: " + ck[i].getName());
            out.println("<br/>");
            out.println("Cookie Value: " + ck[i].getValue());
            out.println("<br/>");
        }
    }
    else
    {
        out.println("No Cookies found.");
        //Code to Add cookies:
        Cookie c = new Cookie("user", "Administrator");
        response.addCookie(c);        
        out.println("<br/> 1 Cookie added");
    }
}
}
