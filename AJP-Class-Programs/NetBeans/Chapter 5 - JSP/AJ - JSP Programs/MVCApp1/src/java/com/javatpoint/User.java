package com.javatpoint;

import java.sql.*;

public class User {
private String name, password, city;

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

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public boolean validate(){
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/test","root","");  
PreparedStatement stmt = 
con.prepareStatement("select * from users where name=? and password=?");  
stmt.setString(1, name);
stmt.setString(2, password);
ResultSet rs = stmt.executeQuery();  
if(rs.next())  
{
    this.city = rs.getString("city");
    return true;
}
con.close();  
}catch(Exception e)
{ System.out.println(e);}      
return false;
}

public boolean register(){
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/test","root","");  
PreparedStatement stmt = 
con.prepareStatement("insert into users (name, password, city) values(?,?,?)" );  
stmt.setString(1, name);
stmt.setString(2, password);
stmt.setString(3, city);
int res = stmt.executeUpdate(); 

if(res==1)  
{
    return true;
}
con.close();  
}catch(Exception e){ System.out.println(e);}      
return false;
}

}
