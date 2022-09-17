import java.sql.*;
public class PreparedStatement_DeleteEx {
public static void main(String[] args) {
try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con =
    DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/test","root","");
    Statement st = con.createStatement();
    PreparedStatement pst;
    pst = con.prepareStatement("delete from employees where id = ?");
    pst.setInt(1,2);
    int result = pst.executeUpdate();
    if (result > 0)
        System.out.println("Row Deleted!!!");
    else
        System.out.println("Row Not Deleted!!!");
}
catch(Exception e){
    System.out.print(e);
 }
} 
}
