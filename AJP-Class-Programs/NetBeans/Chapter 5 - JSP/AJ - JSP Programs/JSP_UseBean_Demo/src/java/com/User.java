package com;
public class User implements java.io.Serializable{  
    private String username;
    private int age;
    private String password;
    
    public User() {
    }
    
    public String getUsername() {
            return username;
    }
    public void setUsername(String username) {
            this.username = username;
    }
    public int getAge() {
            return age;
    }
    public void setAge(int age) {
            this.age = age;
    }
    public String getPassword() {
            return password;
    }
    public void setPassword(String password) {
            this.password = password;
    }
}  