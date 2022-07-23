/*
MYSQL stored procedure with 3 IN parameters to insert record into a table

DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `INSERTR`(IN rollnm INTEGER, IN nm CHAR(20),IN dep CHAR(20))
BEGIN
  insert INTO student (sid, sname, dept) values (rollnm, nm, dep);
  COMMIT;
  
END$$
DELIMITER ;


 */
package callable_statement;

/**
 *
 * @author admin
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
    import java.sql.*; 
import java.util.Scanner;

    public class Callable_Statement_IN {  
    public static void main(String[] args) throws Exception{  
      
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test1","root","");  
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
    while(true)
    {
    // Take input values from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student id : ");
        int rollno = sc.nextInt();
        System.out.println("Enter student name : ");
        String stud_nm = sc.next();
        System.out.println("Enter student department : ");
        String s_dept = sc.next();
        
        // call stored procedure INSERTR
      CallableStatement cs=con.prepareCall("{call INSERTR(?,?,?)}");  
      
      // set values for IN parameters in callable statemetn
      cs.setInt(1, rollno);
      cs.setString(2, stud_nm);
      cs.setString(3, s_dept);
      
      // execute stored procedure
      cs.execute();
     
      // press y to call stored procedure again
      System.out.println("Want to add more records y/n");  
        String ans=br.readLine();  
            if(ans.equals("n")){  
                break;  
            }  
    }
    
    System.out.println("success");     
   
   
  
  
    }  
    }  