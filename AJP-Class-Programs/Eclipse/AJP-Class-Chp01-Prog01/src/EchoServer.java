// Write a Echo Server code

import java.net.*;  
import java.io.*;  
public class EchoServer
{  
	public static void main(String args[])throws Exception
	{  
		try{	
			ServerSocket ss = new ServerSocket(6666);
			System.out.println("Server is waiting for client request...");	
			Socket s = ss.accept();
			System.out.println("Connection established.");	
			DataInputStream din = new DataInputStream(s.getInputStream());
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
			String  clientMessage = (String)din.readUTF();
			System.out.println("Client: "+clientMessage);
			
			dout.writeUTF(clientMessage);  
			dout.flush();  
			dout.close();  
			
			din.close();
			s.close();
			ss.close();
			}
			catch(Exception e)
			{System.out.println(e);}
	}
}