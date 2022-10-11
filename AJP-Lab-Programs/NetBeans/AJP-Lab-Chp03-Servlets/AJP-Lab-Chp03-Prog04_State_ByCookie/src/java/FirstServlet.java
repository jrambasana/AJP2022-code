import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet {
public void doPost(HttpServletRequest request, HttpServletResponse response){
try{

response.setContentType("text/html");
PrintWriter out = response.getWriter();

String n=request.getParameter("userName");
out.print("Welcome "+n);

Cookie ck = new Cookie("uname",n);//creating cookie object
response.addCookie(ck);//adding cookie in the response

//creating submit button
out.print("<a href='servlet2'>Servlet 2</a>");
out.close();

}catch(Exception e){System.out.println(e);}
}
}

