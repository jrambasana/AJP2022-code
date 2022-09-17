import java.sql.*;
import java.util.*;
import java.net.*;

public class PreparedStatement_UpdateEx {
public static void main(String[] args) {
try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con =
    DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/test","root","");
    Statement st = con.createStatement();
    PreparedStatement pst;
    pst = con.prepareStatement("UPDATE employees "
   	 			+ "SET name = ? WHERE id = ?");
    pst.setString(1,"Nancy");
    pst.setInt(2,2);
    int result = pst.executeUpdate();
    if (result > 0)
        System.out.println("Row Updated!!!");
    else
        System.out.println("Row Not Updated!!!");
}
catch(Exception e){
    System.out.print(e);
 }
} 
}
