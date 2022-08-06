import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;


public class Simple extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();

    String u=request.getParameter("userName");
    String p=request.getParameter("userPass");
    if(u.equals("admin") && p.equals("admin")){
        RequestDispatcher rd=request.getRequestDispatcher("welcome");
        rd.forward(request, response);
    }
    else{
        out.print("Sorry username or password error!");
        RequestDispatcher rd=request.getRequestDispatcher("login.html");
        rd.include(request, response);
    }
}
}
