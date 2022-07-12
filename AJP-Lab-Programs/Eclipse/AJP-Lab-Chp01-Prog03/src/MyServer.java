// Write a two – way network based chat application. 
// It will use TCP/IP protocol and it will do communication in serial manner.

import java.net.*;  
import java.io.*;  
public class MyServer
{  
	public static void main(String args[])throws Exception
	{  
		ServerSocket ss=new ServerSocket(3333);  
		System.out.println("Server started.");  

		Socket s=ss.accept();  
		DataInputStream din=new DataInputStream(s.getInputStream());  
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
		BufferedReader br=new BufferedReader(new    
		InputStreamReader(System.in));  
		String str="",str2="";  
		while(!str.equals("stop"))
		{  
            System.out.println("Waiting for Client's messsage...");  
			str=din.readUTF();  
			System.out.println("Client says: "+str);  
            System.out.print("Enter your message here: ");  
			str2=br.readLine();  
			dout.writeUTF(str2);  
			dout.flush();  
		}  
		din.close();  
		s.close();  
		ss.close();  
	}
}