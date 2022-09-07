
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class conServ extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        
        ServletContext ct = getServletContext();
        String st = ct.getInitParameter("db");
        
        PrintWriter out = resp.getWriter();
        out.print("The driver fetched from web.xml file: "+st);
        
    }
    
    


}
