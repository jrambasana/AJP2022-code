/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package executebatch_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author admin
 */
public class ExecuteBatch_demo {

    /**
     * @param args the command line arguments
     */
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost/MU";

   //  Database credentials
   static final String USER = "root";
   static final String PASS = "";
   
    public static void main(String[] args) {
       Connection conn = null;
  
   try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to database...");
      conn = DriverManager.getConnection(DB_URL,USER,PASS);

      //STEP 4: Execute a query
      System.out.println("Creating statement...");
        
        // Create statement object
Statement stmt = conn.createStatement();

// Set auto-commit to false
conn.setAutoCommit(false);

// Create SQL statement
String SQL = "INSERT INTO student (sid, sname, dept) VALUES(1213,'Zia', 'MBA')";
// Add above SQL statement in the batch.
stmt.addBatch(SQL);

// Create one more SQL statement
String SQL1 = "INSERT INTO student (sid, sname, dept) VALUES (5656,'Raj', 'BBA')";
// Add above SQL statement in the batch.
stmt.addBatch(SQL1);

// Create one more SQL statement
String SQL2 = "delete from student where sname= 'Raj'";
// Add above SQL statement in the batch.
stmt.addBatch(SQL2);

// Create an int[] to hold returned values
int[] count = stmt.executeBatch();
System.out.println("Number of records affected " + count.length);
//Explicitly commit statements to apply changes
conn.commit();
  }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }
   System.out.println("Goodbye!");}
    
}