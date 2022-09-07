import java.sql.*;

public class UpdatableResultSetExample3 {
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
         
    // Move cursor to last row
         // Delete last row
         rs.last();
         rs.deleteRow();

         // Move cursor to 2nd row
         // Delete 2nd row
         rs.absolute(2);
         rs.deleteRow();

         // Move cursor to before the first row. 
         rs.absolute(0);

         while (rs.next()) {
            System.out.println(
                  "ID : " + rs.getInt("ID") + " \tNAME : " + rs.getString("NAME"));
         }

      } catch (Exception e) {
         System.out.println(e);
      }
   }
}