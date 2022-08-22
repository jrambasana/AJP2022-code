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
   out.println("<a href='welcome?user_name="+name+"'>Welcome page</a>");
   //OR 
   //response.sendRedirect("welcome?user_name="+name+"");
}
else
{
    out.println("Password error!!!");
}
}   
}