/*
MYSQL stored procedure with 1 OUT parameter to get count of records from a table

DELIMITER $$
CREATE OR REPLACE DEFINER=`root`@`localhost` PROCEDURE `student_count`(OUT `cnt` VARCHAR)
    NO SQL
BEGIN
SELECT COUNT(*) as cnt FROM student;
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

    public class Callble_Statement_OUT {  
    public static void main(String[] args) throws Exception{  
      
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","");  
    
        
        // call stored procedure INSERTR
      CallableStatement cs=con.prepareCall("{call student_count(?)}");
     
    cs.registerOutParameter(1, java.sql.Types.VARCHAR);
    cs.executeQuery();
    System.out.println("Student count " + cs.getInt("CNT"));
    
      // execute stored procedure
      cs.execute();
     
   
   
  
  
    }  
    }  