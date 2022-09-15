/**
 * Q061:
 * Write a program to demonstrate the Statement interface in JDBC.
 */
import java.sql.*;  
public class  StatementDemo2 {  
public static void main(String args[]){  
try{  
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con = 
    DriverManager.getConnection( "jdbc:mysql://localhost:3306/test", "root", "");  
    Statement stmt=con.createStatement();  
    int result = stmt.executeUpdate("delete from employees where id=1");
    System.out.println(result+" records affected");
    con.close();  
}
catch(Exception e){ System.out.println(e);}  
}  
}
