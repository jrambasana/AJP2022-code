// Write a Echo Client code

import java.net.*;
import java.util.Scanner;
import java.io.*;  
class EchoClient
{  
	public static void main(String args[])throws Exception
	{ 
		try{      
			  System.out.println("Connectioned initiated with server.");	
			  Socket s = new Socket("localhost",6666);  
			  System.out.println("Connectioned established.");	
			  DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			  DataInputStream din=new DataInputStream(s.getInputStream());  
			  Scanner input = new Scanner(System.in);
			  
			  System.out.print("Enter your message for Server: ");
			  String message = input.nextLine();
			  dout.writeUTF(message);  
			  dout.flush();  
			  
		      String echoMessage = (String) din.readUTF();  
		      System.out.println("Message echoed back from Server: "+echoMessage);  
			  din.close();

			  dout.close();  
			  s.close();  
			  }
			  catch(Exception e){System.out.println(e);} 
	}
}