package rowsetexample;

import javax.sql.rowset.JdbcRowSet;  
import javax.sql.rowset.RowSetProvider;  
  
public class RowSetExample {  
public static void main(String[] args) throws Exception 
{  
Class.forName("com.mysql.jdbc.Driver");  

//Creating and Executing RowSet  
JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();  
rowSet.setUrl("jdbc:mysql://localhost/mu");  
rowSet.setUsername("root");  
rowSet.setPassword("");  

rowSet.setCommand("select * from student");  
rowSet.execute();  

while (rowSet.next()) {  
// Generating cursor Moved event  
System.out.println("Student Id: " + rowSet.getString(1)+ " Student Name: " + rowSet.getString(2) + " Department Name: " + rowSet.getString(3));  
}  

}  
}  