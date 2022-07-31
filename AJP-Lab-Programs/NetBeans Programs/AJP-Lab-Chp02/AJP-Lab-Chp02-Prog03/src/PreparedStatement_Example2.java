/**
 *
 * @author Jatin Ambasana
 */
import java.sql.*; 

public class PreparedStatement_Example2
{
public static void main(String[] args)
{
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = 
            DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb1","root","");
        System.out.println("Connection established");
        
        //Insert a record
        PreparedStatement pst = 
            con.prepareStatement("Insert into emp values(?,?,?,?)");
        pst.setInt(1,4);
        pst.setString(2, "Mohit");
        pst.setInt(3,22);
        pst.setString(4, "Ahmedabad");        
        int i = pst.executeUpdate();
        if(i==0)
            System.out.println("Record Not inserted"); 
        else
            System.out.println("Record inserted");
        
        //update a record
        Statement st = con.createStatement();
        int j = st.executeUpdate("UPDATE emp SET age = 21 where id = 4");
        if(j==0)
            System.out.println("Table not updated"); 
        else
            System.out.println("Table updated");
        
        //Display a record
        ResultSet rs = st.executeQuery("select * from emp");
        System.out.println("\n\n=========================================================");
        System.out.println("ID\t\tName\t\tage\t\tCity");
        System.out.println("--------\t------------\t--------\t--------");
        while(rs.next())  
            System.out.println("    " + rs.getInt(1) 
            + "\t\t" + rs.getString(2) + "\t\t" + rs.getInt(3) + "\t\t" + rs.getString(4) );
        System.out.println("=========================================================");
        con.close();           
    }
    catch(Exception e){
        System.out.println(e);
    }            
} 
} 