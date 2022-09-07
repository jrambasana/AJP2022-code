/*

-- Create a table
CREATE TABLE employee (
  id int(11) NOT NULL,
  name varchar(30) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Insert sample data in a table
insert into employee (id,name ) values (1,'Sunil Singh');
insert into employee (id,name ) values (2,'David Miller');
insert into employee (id,name ) values (3,'Dean Jones');
insert into employee (id,name ) values (4,'Ramesh Kumar');


*/

import java.sql.*;

public class UpdatableResultSetExample1 {
   public static void main(String[] args) {
      String jdbcUrl = "jdbc:mysql://localhost:3306/mydb1";
      String username = "root";
      String password = "";
      String sql = "select id, name from employee";

      try {
        Class.forName("com.mysql.jdbc.Driver");          
        Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
        PreparedStatement stmt = conn.prepareStatement(sql,
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = stmt.executeQuery();

         // Move cursor to 1st row
         rs.absolute(2);
         System.out.println("ID : " + rs.getInt("ID") + " \tNAME : " + rs.getString("NAME"));
         
         // Move cursor to 4th row
         rs.absolute(4);
         System.out.println("ID : " + rs.getInt("ID") + " \tNAME : " + rs.getString("NAME"));

         // Move cursor to last row
         rs.first();
         System.out.println("ID : " + rs.getInt("ID") + " \tNAME : " + rs.getString("NAME"));
         
         // Move cursor to last row
         rs.last();
         System.out.println("ID : " + rs.getInt("ID") + " \tNAME : " + rs.getString("NAME"));
        
      } catch (Exception e) {
         System.out.println(e);
      }
   }
}