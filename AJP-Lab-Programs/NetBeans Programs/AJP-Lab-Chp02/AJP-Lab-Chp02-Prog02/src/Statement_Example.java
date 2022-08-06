/*
 * Write a JDBC application which will interact with
 * Database and perform the following task.
 * 1) Create EMP Table with ID, Name, Age and City fields.
 * 2) Using Statement Object display the content of Record.
 * 3) Using Statement Object Insert One Record.
 * 4) Using Statement Object Update One Record.
 * 5) Using Statement Object Delete One Record.
 */
/**
 *
 * @author Jatin Ambasana
 */
import java.net.*;
import java.sql.*;
import java.util.*;
public class Statement_Example{
public static void main(String[] args)
{
try
{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb1","root","");
    System.out.println("Connection Established");
    Statement st = con.createStatement();
    con.setAutoCommit(false);
    
    System.out.println("1. To Create Table and Insert Data");
    System.out.println("2. To Display Data");
    System.out.println("3. To Update Data");
    System.out.println("4. To Delete a Record");
    System.out.println("5. To Drop the Table");
    System.out.println("Enter Your Choice:");

    Scanner s = new Scanner(System.in);
    int ch = s.nextInt();
    boolean result;
    
    switch(ch)
    {
    case 1: {
        // create a table
        int r = st.executeUpdate("Create table emp2" 
            + "(id int, name varchar(50), age int, city varchar(50) )" ); 
        if (r == 0){
            System.out.println("TABLE CREATED SUCCESSFULLY");
        }
        else {
            System.out.println("TABLE NOT CREATED SUCCESSFULLY");
            break;
        }            
        r = st.executeUpdate("Insert into emp2 values(1, 'Jack Pack', 21, 'Mumbai')");
        r = st.executeUpdate("Insert into emp2 values(2, 'Chuk Muck', 22, 'Pune')");
        if (r != 0)
             System.out.println("Data Inserted");
        else
             System.out.println("Data Not Inserted");            
        break;
    } 
    case 2: {
        ResultSet rs = st.executeQuery("select * from emp2");
        while(rs.next()){
           int rollno = rs.getInt(1);
           String name = rs.getString(2);
           int age = rs.getInt(3);
           String city = rs.getString(4);
           System.out.println("Roll: " +rollno
                   +"\t Name: "+name+ " " 
                   +"\t Age: "+age+" " +"\t City: "+city);
        }
        break;
    } 
    case 3: {
       int r = st.executeUpdate("UPDATE emp2 SET id = 3 WHERE id = 1");
       if (r == 0)
           System.out.println("Row Not Updated!!!");
       else
           System.out.println("Row Updated!!!");
        break;
    } 
    case 4: {
        int r = st.executeUpdate("DELETE FROM emp2 WHERE id = 2"); 
        if (r == 0)
            System.out.println("Row Not Deleted!!!");
        else 
            System.out.println("Row Deleted!!!");
        break;
    }
    case 5: {
        int r = st.executeUpdate("Drop table emp2");
        if (r == 0)
            System.out.println("TABLE DROPPED SUCCESSFULLY");
        else 
            System.out.println("TABLE NOT DROPPED SUCCESSFULLY");
        break;
    }
    }
    con.commit();
}
catch(Exception e){
    System.out.println(e); 
} 
} 
} 