/**
 * Q002:
 * Write a sample TCP based Java code for a client 
 * to send a "Hello" message to a server.
 */
import java.io.*;  
import java.net.*;  
public class Q002_Server {
public static void main(String[] args){  
    try{  
        ServerSocket ss=new ServerSocket(6666);  
        Socket s=ss.accept();//establishes connection   
        DataInputStream dis=new DataInputStream(s.getInputStream());  
        String  str=(String)dis.readUTF();  
        System.out.println("Client: "+str);  
        ss.close();  
    }catch(Exception e){System.out.println(e);}  
}  
}  