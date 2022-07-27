/*
 * Write a JDBC application which will interact with
 * Database and perform the following task.1) Create Student Table with
 * Roll No, Name, and Address field and insert few records.2) Using
 * Statement Object display the content of Record.3) Using Statement
 * Object Insert Two Record.4) Using Statement Object Update One
 * Record5) Using Statement Object Delete One Record.6) Using
 * Statement Object display the content of Record.
 */
/**
 *
 * @author Jatin Ambasana
 */
import java.net.*;
import java.sql.*;
import java.util.*;
public class JDBC_Application{
public static void main(String[] args)
{
try
{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb1","root","");
    System.out.println("Connection Established");
    Statement st = con.createStatement();

    System.out.println("1. To Insert Data");
    System.out.println("2. To Display Data");
    System.out.println("3. To Update Data");
    System.out.println("4. To Delete a Record");
    System.out.println("Enter Your Choice:");

    Scanner s = new Scanner(System.in);
    int ch = s.nextInt();
    
    switch(ch)
    {
    case 1: {
       int r = st.executeUpdate("Insert into emp values(3, 'XYZ XXX', 21, 'Mumbai')");
       if (r != 0)
            System.out.println("Data Inserted");
       else
            System.out.println("Data Not Inserted");            
       break;
    } 
    case 2: {
        ResultSet rs = st.executeQuery("select * from emp");
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
        int r = st.executeUpdate("UPDATE emp SET id = 2 WHERE id = 3");
       if (r != 0)
           System.out.println("Row Updated!!!");
       else
           System.out.println("Row Not Updated!!!");
        break;
    } 
    case 4: {
        int r = st.executeUpdate("DELETE FROM emp WHERE id = 2"); 
        if (r != 0)
            System.out.println("Row Deleted!!!");
        else 
            System.out.println("Row Not Deleted!!!");
        break;
    }
    }
}
catch(Exception e){
    System.out.print(e); 
} 
} 
} 