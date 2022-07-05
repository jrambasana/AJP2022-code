import java.io.*;  
import java.net.*;  
public class EchoClient {  
 public static void main(String[] args) 
 {  
  try{      
  System.out.println("Connectioned initiated with setver.");	
  Socket s=new Socket("10.80.4.143",6666);  
  System.out.println("Connectioned established.");	
  DataOutputStream dout = new DataOutputStream(s.getOutputStream());
  dout.writeUTF("Hello Server");  
  dout.flush();  
  dout.close();  
  s.close();  
  }
  catch(Exception e){System.out.println(e);} 
 }  
}
