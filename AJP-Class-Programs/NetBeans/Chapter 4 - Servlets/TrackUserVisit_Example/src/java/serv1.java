import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class serv1 extends HttpServlet 
{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
{
    resp.setContentType("text/html");
    PrintWriter out = resp.getWriter();

    HttpSession session = req.getSession();
    String msg;

    Integer count = (Integer) session.getAttribute("count");

    if(count == null){

        count = 1;
    }else{
        count = count + 1;
    }
    msg= "Welcome for your Visit no: ";

    session.setAttribute("count", count);
    out.print(msg+count);
}    
}
