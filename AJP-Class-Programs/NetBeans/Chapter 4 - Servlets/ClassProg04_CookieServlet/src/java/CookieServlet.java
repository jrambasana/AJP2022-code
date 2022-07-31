import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
 
// Extend HttpServlet class
@WebServlet("/CookieForm")
public class CookieServlet extends HttpServlet {
    String title = "Setting Cookies Example";

  public void doPost(HttpServletRequest request,
    HttpServletResponse response) throws ServletException, IOException
  {
      // Create cookies for first and last names.      
      Cookie firstName = new Cookie("first_name",
                      request.getParameter("first_name"));
      Cookie lastName = new Cookie("last_name",
                      request.getParameter("last_name"));

      // Set expiry date after 24 Hrs for both the cookies.
      firstName.setMaxAge(60*60*24); 
      lastName.setMaxAge(60*60*24); 

      // Add both the cookies in the response header.
      response.addCookie( firstName );
      response.addCookie( lastName );

      // Set response content type
      response.setContentType("text/html");
 
      PrintWriter out = response.getWriter();
      String docType = "<!DOCTYPE html>\n";
      out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + title + "</h1>\n" +
                "<ul>\n" +
                "  <li><b>First Name</b>: "
                + request.getParameter("first_name") + "\n" +
                "  <li><b>Last Name</b>: "
                + request.getParameter("last_name") + "\n" +
                "</ul>\n" +
                "</body></html>");
  }
protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    
    //Code to Read Cookies
    Cookie ck[] = request.getCookies();
    if (ck != null)
    {
    out.println("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + title + "</h1>\n");
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
    out.println("</body></html>"); 
} 
}