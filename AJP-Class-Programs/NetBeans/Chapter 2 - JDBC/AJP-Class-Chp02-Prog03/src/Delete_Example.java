/**
 *
 * @author Jatin Ambasana
 */
import java.io.*;
import java.sql.*;
public class Delete_Example 
{
public static void main(String[] args) 
{
    try 
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb1","root","");
        con.setAutoCommit(true);
        Statement st = con.createStatement();
        String q1 = "Delete from emp where id=4";
        String q2 = "Insert into emp values(4,'Pack','19','Rajkot')";
        if(st.executeUpdate(q1)==1) 
        {
            System.out.println("Total rows deleted: " + st.getUpdateCount());
        }
        else 
        {
            int i = st.executeUpdate(q2);
            System.out.println("Total rows inserted: " + i);
        }
        viewData(con);
        st.close();                                
        con.close();
    }
    catch(Exception e) {
        System.out.println(e.getMessage());
    }
}
public static void viewData(Connection con) throws Exception
{
    Statement stmt = con.createStatement(); 
    
    //step4 execute query  
    ResultSet rs = stmt.executeQuery("select * from emp"); 

    System.out.println("TABLE DATA: ");
    while(rs.next())  
        System.out.println(rs.getInt(1)+"  "+rs.getString(2)
            +"  "+rs.getString(3)+"  "+rs.getString(4));
}
}
