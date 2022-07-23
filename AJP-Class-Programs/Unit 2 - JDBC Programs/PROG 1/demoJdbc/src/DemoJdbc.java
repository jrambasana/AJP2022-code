import java.sql.*;
public class DemoJdbc {

    public static void main(String[] args) {
        try {
            //1. Register the driver
            Class.forName("com.mysql.jdbc.Driver");
            
            //2. establish connection by con object
            
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mu","root","");

            System.out.println("Connection established");
            
            //3. Create the statement object which is 
            //used to execute query in database
            
                Statement stmt=con.createStatement();  
  
            //step4 execute query  

                ResultSet rs=stmt.executeQuery("select * from emp");  
                while(rs.next())  
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
                System.out.println("DATA FETCHED");
            //5.close the connection
            
            con.close();
            
        } catch (Exception e) {
        }
    }
}
