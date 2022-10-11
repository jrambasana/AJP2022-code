/*
 * Write a JDBC application which will interact with
 * Database and perform the following task. 
 * 1) Create Students Table with ID, Name, City and State fields and insert few records.
 * 2) Using PreparedStatementObject display the content of Record.
 * 3) Using PreparedStatementObject Insert One Record. 
 * 4) Using PreparedStatementObject Update One Record.
 * 5) Using PreparedStatementObject Delete One Record.
 */

/**
 *
 * @author Jatin Ambasana
 */
import java.sql.*;
import java.util.*;
import java.net.*;

public class PreparedStatement_Example 
{
public static void main(String[] args) 
{
try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb1","root","");
    System.out.println("Connection Established");
    PreparedStatement pst;
    Scanner sc = new Scanner(System.in);

    System.out.println("1. To Create a Table");
    System.out.println("2. To Insert Data");
    System.out.println("3. To Display Data");
    System.out.println("4. To Update Data");
    System.out.println("5. To Delete a Record");
    System.out.println("6. To Drop the Table");
    System.out.println("Enter Your Choice:");

    int ch = sc.nextInt();
    boolean result;

    switch(ch){
    case 1: {
        pst = con.prepareStatement("Create table Students " 
            + "(id int, name varchar(50), city varchar(50), state varchar(50) )");
        result = pst.execute(); 
        if (result)
            System.out.println("TABLE NOT CREATED SUCCESSFULLY");
        else
            System.out.println("TABLE CREATED SUCCESSFULLY");         
        break;
    }
    case 2: {
        pst = con.prepareStatement("insert into students values(?,?,?,?)");
        pst.setInt(1,5);
        pst.setString(2,"Harshdeep");
        pst.setString(3, "Mehsana");
        pst.setString(4, "Gujarat");
        int r = pst.executeUpdate();
        if (r != 0)
             System.out.println("Data Inserted");
        else
             System.out.println("Data Not Inserted");            
        break;
    }
    case 3: {
//        pst = con.prepareStatement("Select * FROM students where id = ?");
//        pst.setInt(1, 1);
        pst = con.prepareStatement("Select * FROM students");
        ResultSet rs = pst.executeQuery();
        while(rs.next())
        {
            int rollno = rs.getInt(1);
            String name = rs.getString(2);
            String city = rs.getString(3);
            String state = rs.getString(4);
            System.out.println("Id: " +rollno+" Name: " +name
                    + " add: "+city+ " State: "+state);
        }
        break;
    }
    case 4: {
        pst = con.prepareStatement("UPDATE students "
                + " SET name = ? WHERE id = ?");
        pst.setString(1,"Nancy");
        pst.setInt(2,2);
        pst.executeUpdate();
        System.out.println("Row Updated!!!");
        break;
    }
    case 5: {
        pst= con.prepareStatement("DELETE FROM students Where id=?");                   
        pst.setInt(1,2);
        pst.executeUpdate();
        System.out.println("Row Deleted!!!");
        break;
    }
    case 6: {
        pst = con.prepareStatement("Drop table students");
        result = pst.execute();
        if (result)
            System.out.println("TABLE NOT DROPPED SUCCESSFULLY");
        else 
            System.out.println("TABLE DROPPED SUCCESSFULLY");
        break;
    }
    }
}
catch(Exception e){
    System.out.println(e);
 }
} 
}
