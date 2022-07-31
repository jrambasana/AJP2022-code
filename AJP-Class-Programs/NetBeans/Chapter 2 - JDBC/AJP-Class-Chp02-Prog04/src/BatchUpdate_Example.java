/**
 *
 * @author Jatin Ambasana
 */

import java.sql.*;  
public class BatchUpdate_Example 
{  
public static void main(String args[])
{  
    try{  
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con = 
            DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb1","root","");

        PreparedStatement stmt=con.prepareStatement("insert into emp values(?,?,?,?)");  

        stmt.setInt(1,1); 
        stmt.setString(2,"Jack");
        stmt.setInt(3,19); 
        stmt.setString(4,"Surat");
        stmt.addBatch();

        stmt.setInt(1,2); 
        stmt.setString(2,"Pack");
        stmt.setInt(3,20); 
        stmt.setString(4,"Mumbai");
        stmt.addBatch();

        stmt.setInt(1,3);  
        stmt.setString(2,"Rack");
        stmt.setInt(3,21); 
        stmt.setString(4,"Pune");
        
        stmt.addBatch();
        int[] i=stmt.executeBatch();  
        System.out.println(i.length+" records inserted");  
        
        con.close();  
    }
    catch(Exception e){ 
        System.out.println(e);
    }    
}  
}  