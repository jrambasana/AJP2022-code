import java.io.*;  
import java.net.*;
import java.util.Scanner;  
public class Client2 {  
 public static void main(String[] args) 
 {  
  try{      
  System.out.println("Connectioned initiated with server.");	
  Socket s = new Socket("localhost",6666);  
  System.out.println("Connectioned established.");	
  DataOutputStream dout = new DataOutputStream(s.getOutputStream());
  Scanner input = new Scanner(System.in);
  System.out.print("Enter your message for Server: ");
  String message = input.nextLine();
  dout.writeUTF(message);  
  dout.flush();  
  dout.close();  
  s.close();  
  }
  catch(Exception e){System.out.println(e);} 
 }  
}
