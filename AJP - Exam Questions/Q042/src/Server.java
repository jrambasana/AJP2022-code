/**
 * Q042:
 * Write a client-server program using UDP socket. 
 * Develop a program to implement one way communication using 
 * Connection-less programming techniques in Java.
 */
import java.io.*;  
import java.net.*;  
public class Server {  
public static void main(String[] args){  
try{  
    ServerSocket ss=new ServerSocket(9999);  
    Socket s=ss.accept();   
    DataInputStream dis=new DataInputStream(s.getInputStream());  
    String  str=(String)dis.readUTF();  
    System.out.println("Client says: "+str);  
    ss.close();  
}
catch(Exception e)
{   System.out.println(e);  }  
}  
}  
