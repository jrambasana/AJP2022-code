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
Statement stmt=con.createStatement();  
ResultSet rs = stmt.executeQuery(
"select * from users where name='"
+name + "' and password = '" + password +"'");  
if(rs.next())  
{
    this.city = rs.getString("city");
    return true;
}
con.close();  
}catch(Exception e){ System.out.println(e);}      
return false;
}

public boolean register(){
    try{  
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con=DriverManager.getConnection(  
    "jdbc:mysql://localhost:3306/test","root","");  
    Statement stmt=con.createStatement();  
    int res = stmt.executeUpdate("insert into users (name, password, city) values('"
                                +name + "','" + password + "','" + city + "')" );  
    if(res==1)  
    {
        return true;
    }
    con.close();  
    }catch(Exception e){ System.out.println(e);}      
    return false;
}

}
