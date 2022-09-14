import java.sql.*;
public class JDBC_Steps_Demo {
public static void main(String[] args) {
  try {
    //Step 1: Register the driver
    Class.forName("com.mysql.jdbc.Driver");

    //Step 2: Establish connection by con object
    Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/test","root","");
    System.out.println("Connection established");

    //Step 3: Create the statement object
    Statement stmt = con.createStatement(); 
    
    //Step 4: Execute query & iterate over the ResultSet object 
    ResultSet rs = stmt.executeQuery("select * from employees");
    System.out.println("DATA FETCHED: ");
    while(rs.next())  
    System.out.println(rs.getInt(1)
            +"  "+rs.getString(2)
            +"  "+rs.getString(3)
            + "  " +rs.getInt(4));  

    //Step 5: Close the connection
    con.close();
} catch (Exception e) {
    System.out.println(e);
}
}
}
