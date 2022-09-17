/*
 * Design a JDBC application which will demonstrate
 * Scrollable ResultSet functionality.
 */

import java.net.*;
import java.sql.*;
import java.util.*;

public class ScrollableResultSetEx {
public static void main(String[] args) {
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = 
            DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb1","root","");
        System.out.println("Connection Established");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("Select * from emp");
        System.out.println("Table in Forward direction: ");
        while(rs.next())
        {
            System.out.println(rs.getRow()+": "+rs.getInt(1)+"   "+rs.getString(2)+" "+
                               rs.getInt(3)+" "+rs.getString(4) );
        }        
        System.out.println("Table in Reverse direction: ");
//        rs.afterLast();
        while(rs.previous())
        {
            System.out.println(rs.getRow()+": "+rs.getInt(1)+"   "+rs.getString(2)+" "+
                               rs.getInt(3)+" "+rs.getString(4) );
        }

        System.out.println("Table in Random directions: ");        
        rs.absolute(3);
        System.out.println(rs.getRow()+": "+rs.getInt(1)+"   "+rs.getString(2)+" "+
                           rs.getInt(3)+" "+rs.getString(4) );    
        rs.relative(-2);
        System.out.println(rs.getRow()+": "+rs.getInt(1)+"   "+rs.getString(2)+" "+
                           rs.getInt(3)+" "+rs.getString(4) );    
        int i=rs.getRow();
        System.out.println("Cursor position: "+i);
        rs.close();
        st.close();
        con.close();
    }
    catch(Exception e){
        System.out.println(e);
    }
}
}
