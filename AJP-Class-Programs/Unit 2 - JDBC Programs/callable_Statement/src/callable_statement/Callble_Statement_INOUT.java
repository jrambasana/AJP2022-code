/*
MYSQL stored procedure with 1 IN anf 1 OUT parameter to get name of the students from given student id

DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `getStudentName`(IN `VAR_SID` INT, OUT `VAR_SNAME` VARCHAR(20))
BEGIN 
	SELECT sname INTO VAR_SNAME FROM student
	WHERE SID= VAR_SID;
 END$$
DELIMITER ;


 */
package callable_statement;

/**
 *
 * @author admin
 */
    import java.sql.*; 
import java.util.Scanner;

    public class Callble_Statement_INOUT {  
    public static void main(String[] args) throws Exception{  
      
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test1","root","");  
   
    // Take input values from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student id : ");
        int rollno = sc.nextInt();
        
        
        // call stored procedure INSERTR
      CallableStatement cs=con.prepareCall("{call getStudentName(?,?)}");  
      
    // set values for IN parameters in callable statemetn
    cs.setInt(1, rollno);
    cs.registerOutParameter(2, java.sql.Types.VARCHAR);
    cs.execute();
    System.out.println("Name of student is " + cs.getString(2));
    
      // execute stored procedure
      cs.execute();
     
   
   
  
  
    }  
    }  