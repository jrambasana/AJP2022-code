import java.sql.*;
import javax.inject.Named;
import javax.annotation.ManagedBean;
import javax.enterprise.context.ApplicationScoped;

@Named(value = "user")
@ManagedBean  
@ApplicationScoped
public class User {
    private String uname,email;   
    private String password, country;
    
    public User() {
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    public boolean save(){
    int result = 0;  
     try{  
         Class.forName("com.mysql.jdbc.Driver");     
         Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/test","root","");  
         PreparedStatement stmt = con.prepareStatement("insert into user(name, password, email, country) values(?,?,?,?)");  
         stmt.setString(1, this.getUname());  
         stmt.setString(2, this.getPassword());  
         stmt.setString(3, this.getEmail());  
         stmt.setString(4, this.getCountry());  
         result = stmt.executeUpdate();  
     }catch(Exception e){  
         System.out.println(e);  
     }  
     if(result == 1){  
         return true;  
     }else 
         return false;  
     }
    
    public String submit(){  
        if(this.save()){
            return "response.xhtml";
        }else{
            return "index.xhtml";
        }       
    }
}
