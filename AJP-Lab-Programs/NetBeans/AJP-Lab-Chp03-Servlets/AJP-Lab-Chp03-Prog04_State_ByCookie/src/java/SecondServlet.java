import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SecondServlet extends HttpServlet {

public void doGet(HttpServletRequest request, HttpServletResponse response)
{
PrintWriter out = null;
try
{
response.setContentType("text/html");
out = response.getWriter();

Cookie ck[] = request.getCookies();
if(ck != null)
{
    for (int i = 0; i < ck.length ; i++)
        out.println("<br>Cookie Name: "+ ck[i].getName()
                + " Cookie Value is:"+ck[i].getValue());
}
else
    out.println("No cookie found in request.");

out.print("<br/> <a href='servlet3'>Servlet 3</a>");
out.close();

 }
catch(Exception e)
{
    System.out.println(e);
}
}
}
