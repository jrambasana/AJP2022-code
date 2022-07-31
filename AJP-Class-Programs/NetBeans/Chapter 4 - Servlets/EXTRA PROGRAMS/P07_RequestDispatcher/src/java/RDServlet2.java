

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/welcome")
public class RDServlet2 extends HttpServlet {
protected void doPost(HttpServletRequest request, 
  HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out=response.getWriter(); 
    String name = request.getParameter("username");
    String password   = request.getParameter("password");
    out.println("<h1> Welcome "+name+"</h1>");
}

}
