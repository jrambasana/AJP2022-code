import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloFilter implements Filter 
{
    
public void init (FilterConfig arg0) throws ServletException 
{ }

public void doFilter (ServletRequest req, ServletResponse resp, FilterChain chain) 
    throws IOException, ServletException 
{
    PrintWriter out=resp.getWriter();
    out.print("filter is invoked before");
    chain.doFilter(req, resp);//sends request to next resource
    out.print("filter is invoked after");
    out.println("<br>");
    out.println("Click here to go to page <a href='hello2'>Hello 2</a>");
    
}

public void destroy( ) 
{ }

}
