import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MyServlet extends HttpServlet {
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
{
response.setContentType("text/html;charset=UTF-8");
PrintWriter out = response.getWriter();
String name = request.getParameter("user");
String pass = request.getParameter("pass");
if(pass.equals("1234"))
{
   out.println("Welcome "+name);
   // For URL Rewriting
   out.println("<br><a href='welcome?user_name="+name+"'>Welcome page</a>");
   
   // For Hidden Form field
   out.println("<form action='welcome' method='GET'>");
   out.println("<input type='hidden' name='user_name' value='"+name+"'>");
   out.println("<input type='submit' name='submit' value='Welcome'>");
   out.println("</form>");
   
   //OR 
   //response.sendRedirect("welcome?user_name="+name+"");
}
else
{
    out.println("Password error!!!");
}
}   
}