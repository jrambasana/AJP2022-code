package ajp.pkgclass.chp01.prog01;
import java.io.*;  
import java.net.*;  
import java.util.Scanner;
public class Client3
{  
public static void main(String[] args) 
{  
try{      
    System.out.println("Connectioned initiated with setver.");	
    Socket s = new Socket("localhost",6666);  
    System.out.println("Connectioned established.");	
    DataOutputStream dout = new DataOutputStream(s.getOutputStream());
    Scanner input = new Scanner(System.in);
    String clientMessage = input.nextLine();
    dout.writeUTF(clientMessage);  
    dout.flush(); 
    
    DataInputStream din = new DataInputStream(s.getInputStream());
    String echoedMessage = (String)din.readUTF();
    System.out.println("Server: " + echoedMessage);	
    din.close();
    
    dout.close();  
    s.close();  
}
catch(Exception e){System.out.println(e);} 
}  
}
