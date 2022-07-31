import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
  
protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    String user = request.getParameter("username");
    String pwd  = request.getParameter("password");
    RequestDispatcher rd = null;
    
    if(user.equals("admin") && pwd.equals("admin")){
        rd = request.getRequestDispatcher("homepage");
        rd.forward(request, response);
    }
    else
    {
        out.println("<h3>Login Error!!!</h3>");
        rd = request.getRequestDispatcher("login.html");
        rd.include(request, response);
    }
}

}
