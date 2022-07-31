package rowsetexample;

import javax.sql.rowset.JdbcRowSet;  
import javax.sql.rowset.RowSetProvider;  
  
public class RowSetExample {  
public static void main(String[] args) throws Exception 
{  
    Class.forName("com.mysql.jdbc.Driver");  

    //Creating and Executing RowSet  
    JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();  
    rowSet.setUrl("jdbc:mysql://localhost:3306/mydb1");  
    rowSet.setUsername("root");  
    rowSet.setPassword("");  

    rowSet.setCommand("select * from emp");  
    rowSet.execute();  

    while (rowSet.next()) {  
    System.out.println("Emp Id: " + rowSet.getString(1)
            + " Name: " + rowSet.getString(2) 
            + " Age: " + rowSet.getInt(3)
            + " City: " + rowSet.getString(4) );  
    }  
}  
}  