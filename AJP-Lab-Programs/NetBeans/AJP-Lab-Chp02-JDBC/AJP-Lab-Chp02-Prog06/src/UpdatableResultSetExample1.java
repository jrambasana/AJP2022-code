/*

-- Create a table
CREATE TABLE employee2 (
  id int(11) NOT NULL,
  name varchar(30) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Insert sample data in a table
insert into employee2 (id,name ) values (1,'Sunil Singh');
insert into employee2 (id,name ) values (2,'David Miller');
insert into employee2 (id,name ) values (3,'Dean Jones');
insert into employee2 (id,name ) values (4,'Ramesh Kumar');


*/
import java.sql.*;

public class UpdatableResultSetExample1 {
   public static void main(String[] args) {
      String jdbcUrl = "jdbc:mysql://localhost:3306/test";
      String username = "root";
      String password = "";
      String sql = "select id, name from employee2";

      try {
        Class.forName("com.mysql.jdbc.Driver");          
        Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
        PreparedStatement stmt = conn.prepareStatement(sql,
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = stmt.executeQuery();
         
         // Save the current cursor position, and move cursor to the insert row, 
         rs.moveToInsertRow();
         //Set columns values
         rs.updateInt("ID", 5);
         rs.updateString("NAME", "Jack Pack");
         //Insert new row
         rs.insertRow();
         
         // Move cursor back to saved position
         rs.moveToCurrentRow();
        while(rs.next())
        {
            System.out.println(rs.getInt(1)+"   "+rs.getString(2));
        }         
      } catch (Exception e) {
         System.out.println(e);
      }
   }
}