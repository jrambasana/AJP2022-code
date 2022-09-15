/**
 * Q061:
 * Write a program to demonstrate the Statement interface in JDBC.
 */
import java.sql.*;  
class StatementDemo1 {  
public static void main(String args[]){  
try{  
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con = 
     DriverManager.getConnection( 
     "jdbc:mysql://localhost:3306/test",   "root", "");  
    Statement stmt=con.createStatement();  
    ResultSet rs=stmt.executeQuery("select * from employees");
    while(rs.next())  
    System.out.println(rs.getInt(1)+"  "
            +rs.getString(2)+"  "+rs.getString(3)+" "+rs.getInt(4));  
    con.close();  
}
catch(Exception e){ System.out.println(e);}  
}
}
