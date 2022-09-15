/**
 * Q026:
 * Write a program to select all records from a table 
 * using the PreparedStatement object.
 */
import java.sql.*;
import java.util.*;

public class Q026_PreparedStatement {
public static void main(String[] args) {
    try {
        //1. Register the driver
        Class.forName("com.mysql.jdbc.Driver");

        //2. establish connection by con object
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/test", "root", "");
        System.out.println("Connection Established");

        //3. Create the PreparedStatement object which is used to execute query in database
        PreparedStatement pst = con.prepareStatement("Select * FROM employees");

        //4. Execute Query  
        ResultSet rs = pst.executeQuery();
        System.out.println("Display Data");
        System.out.printf("%5s %10s %5s %9s","ID", "Name","City","Salary\n");
              while (rs.next()) {
                    System.out.printf("%5s %10s %5s %10s" , rs.getInt(1), rs.getString(2) , rs.getString(3) ,rs.getInt(4) + "\n");
         }

        //5.close the connection
        con.close();
    } catch (Exception e) {
        System.out.println(e);
    }
}
}
