/**
 * Q029:
 * Write a program to insert three records in a table using PreparedStatement Object. 
 * Prerequisite: Run this SQL command to create the table 
 * so that the program can run properly.
 * Create Table emp1(id int, name varchar(50));
 */
import java.sql.*;
import java.io.*;
public class PreparedStatementExample{  
public static void main(String args[]){  
try{  
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");  
    PreparedStatement pstmt=con.prepareStatement("insert into emp1 values(?,?)");  
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int i = 0;
    do
    {
        System.out.print("Enter Id: ");
        int id = Integer.parseInt(br.readLine());
        pstmt.setInt(1,id);
        System.out.print("Enter Name: ");
        String name = br.readLine();
        pstmt.setString(2,name);    
        int res = pstmt.executeUpdate();
        if(res>0)
            i++;
    }while(i<3);
    System.out.println(i+" records inserted");  
    con.close();  
}catch(Exception e)
{ System.out.println(e);}   
}  
}  
