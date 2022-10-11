import java.sql.*;
public class JDBC_Demo1 {
public static void main(String[] args) {
  try {    
      System.out.println("Entered the Try block");
    //1. Register the driver
    Class.forName("com.mysql.jdbc.Driver");
    //2. establish connection by con object
    Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/test","root","");
    System.out.println("Connection established");
    //3. Create the statement object which is 
    //used to execute query in database
    Statement stmt = con.createStatement(); 
    
    //step4 execute query  
    ResultSet rs = stmt.executeQuery("select * from emp1"); 

    System.out.println("DATA FETCHED: ");
    while(rs.next())  
        System.out.println(rs.getInt(1)+"  "+rs.getString(2));
            //+"  "+rs.getInt(3)+"  "+rs.getString(4));  
    
    //5.close the connection
    con.close();
    
} catch (Exception e) {
    System.out.println(e);
}
    System.out.println("Exited the Try block");

}
    
}