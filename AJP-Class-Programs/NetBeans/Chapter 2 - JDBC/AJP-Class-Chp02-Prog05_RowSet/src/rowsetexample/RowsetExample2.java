package rowsetexample;

import javax.sql.RowSetEvent;  
import javax.sql.RowSetListener;  
import javax.sql.rowset.JdbcRowSet;  
import javax.sql.rowset.RowSetProvider;  
      
public class RowsetExample2 {  
public static void main(String[] args) throws Exception 
{  
    Class.forName("com.mysql.jdbc.Driver");  
    JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();  
    rowSet.setUrl("jdbc:mysql://localhost:3306/mydb1");  
    rowSet.setUsername("root");  
    rowSet.setPassword("");  

    rowSet.setCommand("select * from emp");  
    rowSet.execute();  

    //Adding Listener and moving RowSet  
    rowSet.addRowSetListener(new MyListener());  

    while (rowSet.next()) {  
        System.out.println("Emp Id: " + rowSet.getString(1)
                + " Name: " + rowSet.getString(2) 
                + " Age: " + rowSet.getInt(3)
                + " City: " + rowSet.getString(4) );  
    }  
}  
}  

class MyListener implements RowSetListener {  
    @Override
    public void cursorMoved(RowSetEvent event) {  
              System.out.println("Cursor Moved...");  
    }  
    @Override
   public void rowChanged(RowSetEvent event) {  
              System.out.println("Cursor Changed...");  
   }  
    @Override
   public void rowSetChanged(RowSetEvent event) {  
              System.out.println("RowSet changed...");  
   }  
}  