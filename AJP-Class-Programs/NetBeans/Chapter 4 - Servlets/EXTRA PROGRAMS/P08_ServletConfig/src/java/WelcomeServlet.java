/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class WelcomeServlet extends HttpServlet {

public void doGet(HttpServletRequest req, 
        HttpServletResponse res) 
        throws IOException, ServletException
{
    res.setContentType("text/html");
    PrintWriter out = res.getWriter();
    
    String name = req.getParameter("username");
    String password = req.getParameter("password");
    
    ServletConfig sc = getServletConfig();
    
    out.println("<h1> Welcome " + sc.getInitParameter("uname") + "</h1>");
    out.println("<h3> Your password: " + password + "</h3>");
}

}
