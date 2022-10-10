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

public class UpdatableResultSetExample2 {
    public static void main(String[] args) {
      String jdbcUrl = "jdbc:mysql://localhost:3306/test";
      String username = "root";
      String password = "";
      String sql = "select id, name from employee2";

      try {
        Class.forName("com.mysql.jdbc.Driver");          
        Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
        conn.setAutoCommit(false);

        PreparedStatement stmt = conn.prepareStatement(sql,
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = stmt.executeQuery();
        
//         rs.moveToInsertRow();
//         rs.updateInt("ID", 5);
//         rs.updateString("NAME", "Jack Pack");
//         rs.insertRow();
//         rs.moveToCurrentRow();        

         // Move cursor to 2nd row
         // Delete 2nd row
         rs.absolute(5);
         rs.deleteRow();         
         
         conn.commit();
         
    // Move cursor to last row
         // Delete last row
         rs.last();
         rs.deleteRow();



         // Move cursor to before the first row. 
         rs.beforeFirst();

         while (rs.next()) {
            System.out.println(
                  "ID : " + rs.getInt("ID") + " \tNAME : " + rs.getString("NAME"));
         }
         conn.rollback();
//         conn.commit();
      } catch (Exception e) {
         System.out.println(e);
      }
   }
}