import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MyGenericFilter implements Filter
{
private FilterConfig filterconf = null;

public void doFilter(final ServletRequest req, final ServletResponse res, FilterChain chain) throws IOException, ServletException
{
        chain.doFilter(req,res);
}

public FilterConfig getFilterConfig()
{
        return filterconf;
}

public void setFilterConfig(final FilterConfig filterconf)
{
        this.filterconf = filterconf;
}

public void init(FilterConfig filterconf)
{
        this.filterconf = filterconf;
}

public void destroy()
{
        this.filterconf = null;
}
}

