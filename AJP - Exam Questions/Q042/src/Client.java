/**
 * Q042:
 * Write a client-server program using UDP socket. 
 * Develop a program to implement one way communication using 
 * Connection-less programming techniques in Java.
 */
import java.io.*;  
import java.net.*;  
public class Client {  
public static void main(String[] args) {  
try{      
    Socket s=new Socket("localhost",9999);  
    DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
    dout.writeUTF("Hello Server");  
    dout.flush();  
    dout.close();  
    s.close();  
}
catch(Exception e)
{   System.out.println(e);  }
}  
}  