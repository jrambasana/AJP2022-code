package com;
public class Student implements java.io.Serializable{  
    private int roll_no;
    private String name;
    public Student()        { }
    public String getName() 
    {        return name;               }
    public void setName(String name) 
    {        this.name = name;          }
    public int getRoll_no() 
    {       return roll_no;             }
    public void setRoll_no(int roll_no) 
    {       this.roll_no = roll_no;     }
}  