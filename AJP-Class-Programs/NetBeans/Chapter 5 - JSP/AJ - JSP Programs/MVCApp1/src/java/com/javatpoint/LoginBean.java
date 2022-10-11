package com.javatpoint;

import java.sql.*;

public class LoginBean {
private String name,password;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public boolean validate(){
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/test","root","");  
Statement stmt=con.createStatement();  
ResultSet rs = stmt.executeQuery(
"select * from users where name='"
+name + "' and password = '" + password +"'");  
if(rs.next())  
    return true;
con.close();  
}catch(Exception e){ System.out.println(e);}      
return false;
}
}
