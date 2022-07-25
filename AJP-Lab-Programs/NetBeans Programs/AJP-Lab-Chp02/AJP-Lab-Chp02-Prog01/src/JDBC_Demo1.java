/**
 *
 * @author Jatin Ambasana
 */
import java.sql.*;
public class JDBC_Demo1 {
public static void main(String[] args) {
  try {
    //1. Register the driver
    Class.forName("com.mysql.jdbc.Driver");

    //2. establish connection by con object
    Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/jdbcdb1","root","");

    System.out.println("Connection established");

    
} catch (Exception e) {
    System.out.println(e);
}
}
    
}
