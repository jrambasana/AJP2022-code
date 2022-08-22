import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class WelcomeServlet extends HttpServlet {

public void doGet(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String n=request.getParameter("userName");
        out.println("Welcome " + n + " to page 1");
        RequestDispatcher rd = request.getRequestDispatcher("home2");
        rd.forward(request, response);        
//        out.println("Welcome " + n + " to page 1" );
//        out.println("<br>");
//        out.println("Click <a href='home2'>here</a> to go to Homepage 2.");
//        RequestDispatcher rd=request.getRequestDispatcher("home2");
//        rd.include(request, response);
}

}
