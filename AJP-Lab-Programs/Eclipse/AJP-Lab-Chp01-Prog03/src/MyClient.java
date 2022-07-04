// Write a two – way network based chat application. 
// It will use TCP/IP protocol and it will do communication in serial manner.

import java.net.*;   
import java.io.*;  
class MyClient
{  
	public static void main(String args[])throws Exception
	{  
		Socket s=new Socket("localhost",3333);  
		System.out.println("Client started.");  
		
		DataInputStream din=new DataInputStream(s.getInputStream());  
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
		  
		String str="",str2="";  
		while(!str.equals("stop"))
		{
                    System.out.print("Enter your message here: ");  
                    str=br.readLine();  
                    dout.writeUTF(str);  
                    dout.flush();  
                    System.out.println("Waiting for Server's messsage...");  
                    str2=din.readUTF();  
                    System.out.println("Server says: "+str2);  
		}   
		dout.close();  
		s.close();  
	}
}