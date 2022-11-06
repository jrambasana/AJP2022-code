package com;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class HelloWorld {

private String uname;
private String mobno;

public HelloWorld(){
        System.out.println("HelloWorld Started");
}

public String getMobno(){
        return mobno;
}

public void setMobno(String mobno){
        this.mobno=mobno;
}	

public String getUname(){
        return uname;
}

public void setUname(String uname){
        this.uname=uname;
}

}
