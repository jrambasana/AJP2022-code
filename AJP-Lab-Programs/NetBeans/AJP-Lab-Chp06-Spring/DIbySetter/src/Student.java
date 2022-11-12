/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Student {
private String name;

public String getName(){
    return name;
}

public void setName(String name){
    this.name=name;
}

public void displayInfo(){
    System.out.println("Hello:" +name);    
}
}

