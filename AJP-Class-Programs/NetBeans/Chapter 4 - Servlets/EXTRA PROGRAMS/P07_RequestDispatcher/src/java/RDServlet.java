

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class RDServlet extends HttpServlet {
protected void doPost(HttpServletRequest request, 
HttpServletResponse response) throws ServletException, IOException {
response.setContentType("text/html");
PrintWriter out=response.getWriter();     
String name = request.getParameter("username");
String password   = request.getParameter("password");    
if(name.equals("admin") && password.equals("admin"))
{
    RequestDispatcher rd = request.getRequestDispatcher("/welcome");
    rd.forward(request, response);
}
else
{
    out.println("<h2>Username or Password Error</h2>");
    RequestDispatcher rd = request.getRequestDispatcher("index.html");
    rd.include(request, response);
}
}
}
