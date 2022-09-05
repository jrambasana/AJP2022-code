import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class CRUDServlet extends HttpServlet{

protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
    resp.setContentType("text/html");
    PrintWriter out = resp.getWriter();

    String str = req.getParameter("ch");
    int ch = Integer.parseInt(str);

    try {
        Class.forName("com.mysql.jdbc.Driver");

        //2. establish connection by con object
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
        System.out.println("Connection established");

        //3. Create the statement object which is 
        //used to execute query in databas
        Statement st = con.createStatement();
        switch(ch)
        {
        case 1:
        {
            // for creating database
            st.executeUpdate("CREATE DATABASE students");
            out.print("Database created successfully..."); 
            break;
        }

        case 2:
        {
            //con.setCatalog("students");//changes the database
            st.executeUpdate("CREATE TABLE students.student1(id int,name varchar(25),address varchar(50))");
            out.print("Table created successfully..."); 
            break;
        }

        case 3: 
        {
            st.executeUpdate("INSERT INTO students.student1 values(1,'SS','rajkot')");
            out.println("Data inserted...!!");
            break;
        }
        case 4:
        {
            st.executeUpdate("UPDATE students.student1 SET name = 'AA' WHERE id = 1");
            out.println("Table updated....!!");
            break;
        }
        case 5: 
        {
            st.executeUpdate("DELETE FROM students.student1 where id = 1");
            out.println("Record Deleted....!!");
            break;
        }
        case 6:
        {
            st.executeUpdate("DROP TABLE students.student1");
            out.println("Table Deleted....!!");
            break;

        }
        case 7:
        {
            st.executeUpdate("DROP DATABASE students");
            out.println("DB Deleted....!!");
            break;
        }
        } // Switch case ends
      } catch (Exception e) 
      {
          out.println("Error occured: " + e);
      }
}    
    
}
    