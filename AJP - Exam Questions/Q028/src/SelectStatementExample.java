/**
 * Q028:
 * Write a program to select all records 
 * from a table using Statement interface.
 */
import java.sql.*;
public class SelectStatementExample {
public static void main(String[] args) {
    String QUERY = "select * from Employees";
    try 
    {
        Class.forName("com.mysql.jdbc.Driver");  
    
        Connection conn = DriverManager.getConnection
            ("jdbc:mysql://localhost:3306/test", "root", "");

        Statement stmt = conn.createStatement();

        ResultSet rs = stmt.executeQuery(QUERY);

        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String city = rs.getString("city");
            int salary = rs.getInt("salary");
            System.out.println(id + " , " + name + " , " + city + " , " + salary);
        }
    } catch (Exception e) {
        System.out.println(e);
    }
}
}
