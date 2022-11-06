package com.javatpoint;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationServlet extends HttpServlet {
protected void doPost(HttpServletRequest request, HttpServletResponse response)
       throws ServletException, IOException {
    
    String name = request.getParameter("name");
    String password = request.getParameter("password");
    String city = request.getParameter("city");
    
    User u1 = new User();
    u1.setName(name);
    u1.setPassword(password);
    u1.setCity(city);
    
    boolean status = u1.register();
    if(status){
            RequestDispatcher rd=request.getRequestDispatcher("register-success.jsp");
            rd.forward(request, response);
    }
    else{
            RequestDispatcher rd=request.getRequestDispatcher("register-error.jsp");
            rd.forward(request, response);
    }        
}
}
