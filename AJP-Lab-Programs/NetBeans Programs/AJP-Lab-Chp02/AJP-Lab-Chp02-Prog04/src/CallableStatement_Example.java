/*
 * Write a JDBC application which will interact with
 * Database and perform the following task.
 * 1) Create a store procedure which will retrieve City for given employee id.
 * 2) Write a java application which will call the above procedure 
 * and display appropriate information on screen. 
 */
// ++++++++++++++ SQL in the Procedure ++++++++++++++ 
//SELECT city into EMP_CITY 
//FROM emp2
//WHERE id = EMP_ID;
// ++++++++++++++ Stored Procedure++++++++++++++ 
//CREATE PROCEDURE `getEmpCity`
//(IN `EMP_ID` INT, OUT `EMP_CITY` VARCHAR(50)) 
//NOT DETERMINISTIC           CONTAINS SQL            SQL SECURITY 
//DEFINER 
//    SELECT city into EMP_CITY FROM emp WHERE id = EMP_ID;

/**
 *
 * @author Jatin Ambasana
 */

import java.sql.*;  

public class CallableStatement_Example
{
    public static void main(String[] args) throws Exception{  
      
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con = 
            DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb1","root","");
    CallableStatement stmt = 
            con.prepareCall("{call getEmpCity(?,?)}");  
    int empID = 4;
    stmt.setInt(1, empID);
    // Because second parameter is OUT so register it
    stmt.registerOutParameter(2, java.sql.Types.VARCHAR);
    
    //Use execute method to run stored procedure.
    System.out.println("Executing stored procedure..." );
    stmt.execute();

    //Retrieve employee name with getXXX method
    String empCity = stmt.getString(2);    
    System.out.println("Emp having ID: " + empID 
            + ", lives in the City: " + empCity);
    
    stmt.close();
    con.close();
    }  
}  