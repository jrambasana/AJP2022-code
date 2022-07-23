import java.sql.*;
public class PrepareStmt {

    public static void main(String[] args) {
        try {          
          //1. Registration  
          Class.forName("com.mysql.jdbc.Driver");
          
          //2. Connection object
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mu","root","");
          
            //4. execute query
            try ( //3. Statment object to execute query
                    PreparedStatement st = con.prepareStatement("insert into emp values(?,?,?)")) {
                //4. execute query
                
                st.setInt(1,30);
                st.setString(2,"ravi");
                st.setString(3,"EC");
                
                int val = st.executeUpdate();
                System.out.println("Number of rows inserted : "+ val);
                //5. close connection
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }
}
