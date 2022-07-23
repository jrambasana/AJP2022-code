import java.sql.*;
import java.util.Scanner;
public class DemoJdbc {

    public static void main(String[] args) {
        try {
            //1. Register the driver
            Class.forName("com.mysql.jdbc.Driver");
            
            //2. establish connection by con object
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mu","root","");
            System.out.println("Connection established");
            
            //3. Create the statement object which is 
            //used to execute query in database
            Statement st = con.createStatement();
            
            //4. Execute query 
            int ch;
            Scanner s = new Scanner(System.in);
            System.out.println("1. To insert data");
            System.out.println("2. To update data");
            System.out.println("3. To delete data");
            
            System.out.println("Enter your choise :");
            ch = s.nextInt();
            
            switch(ch){
                case 1:{
                int c1 = st.executeUpdate("INSERT into bank_tb Values(10,'mukesh babu',25000,876789876,'Varodra')");
                System.out.println("Data inserted into table");
                break;
                } 
                
                case 2:{
                int i = st.executeUpdate("UPDATE bank_tb SET customerName ='mukesh babu' WHERE accountNo = 1 ");
                if(i==0)
                    
                    System.out.println("Table Not updated");
                else
                    System.out.println("Table updated");
                    break;
                }
                 
                case 3:{
                    st.executeUpdate("DELETE FROM bank_tb WHERE accountNo = 1");
                    break;
                }
       
                default : {
                    ResultSet rs1 = st.executeQuery("SELECT * FROM bank_tb");
                    while(rs1.next())
                      System.out.println(rs1.getInt(1)+"  "+rs1.getString(2)+" "
                              + " "+rs1.getInt(3)+" "+rs1.getInt(4)+" "
                                      +" "+rs1.getString(5));
                  break;
                }
            }
            //5.close the connection
            con.close();
            } 
        catch (Exception e){
        }
    }
}
