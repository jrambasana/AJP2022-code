import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyExceptionServlet extends HttpServlet {
protected void doGet(HttpServletRequest request, 
        HttpServletResponse response) throws ServletException, IOException 
{
    throw new ServletException("SAMPLE ServletException");
}
}
