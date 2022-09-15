/**
 * Q002:
 * Write a sample TCP based Java code for a client 
 * to send a "Hello" message to a server.
 */
import java.io.*;  
import java.net.*;  
public class Q002_Client 
{
public static void main(String[] args) {  
    try{      
        Socket s=new Socket("localhost",6666);  
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
        dout.writeUTF("Hello Server");  
        dout.flush();  
        dout.close();  
        s.close();  
    }catch(Exception e){System.out.println(e);}  
}  
}