import java.sql.*;
public class DemoJdbc {

    public static void main(String[] args) {
        try {
            //1. Register the driver
            Class.forName("com.mysql.jdbc.Driver");
            
            try ( //2. establish connection by con object
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mu","root","")) {
                System.out.println("Connection established");
                //3. Create the statement object which is
                //used to execute query in database
                Statement st = con.createStatement();
                //4. Execute query
                int i = st.executeUpdate("create table student (Roll_no int, Name Varchar(20))");
                if (i==0) {
                    System.out.println("Table created");
                } else {
                    System.out.println("Table Not created");
                }
                //5.close the connection
            }
            
        } catch (ClassNotFoundException | SQLException e) {
       System.out.println(e);
        }
    }
}
