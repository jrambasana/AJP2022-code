/*
 * Design a JDBC application which will demonstrate 
 * the Transaction management functionality.
 */

/**
 *
 * @author Jatin Ambasana
 */
import java.sql.*; 

public class TransactionManagement_Example {
public static void main(String args[])throws Exception
{  
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con = 
        DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb1","root","");  
    con.setAutoCommit(false);
    viewData(con);
    Statement stmt = con.createStatement();  
    stmt.addBatch("insert into students values(1,'Abhi','Surat','Gujarat')");  
    stmt.addBatch("insert into students values(2,'Mihir','Pune','Maharashtra')");  
    stmt.addBatch("insert into students values(3,'Ajay','Mumbai','Maharashtra')");  
    stmt.addBatch("insert into students values(4,'Raj','Rajkot','Gujarat')");  
    stmt.executeBatch();
    System.out.println("Data Inserted");
    viewData(con);
//    con.commit();
//    System.out.println("Data Committed");
    con.rollback();
    System.out.println("Data Rolled back");
    viewData(con);
    con.close();  
}
public static void viewData(Connection con) throws Exception
{
    Statement stmt = con.createStatement(); 
    
    //step4 execute query  
    ResultSet rs = stmt.executeQuery("select * from students"); 

    System.out.println("TABLE DATA: ");
    while(rs.next())  
        System.out.println(rs.getInt(1)+"  "+rs.getString(2)
            +"  "+rs.getString(3)+"  "+rs.getString(4));
}
}
