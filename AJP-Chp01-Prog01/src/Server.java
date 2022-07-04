import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Server {

	public static void main(String[] args) throws Exception 
	{
		ServerSocket ss=new ServerSocket(9999);
		System.out.println("Server is waiting...");
		Socket s2=ss.accept();
		DataInputStream din=new DataInputStream(s2.getInputStream());
		String str;
		str=din.readUTF();
		System.out.println("Client says:\t"+str);
		DataOutputStream dout=new DataOutputStream(s2.getOutputStream());
		dout.writeUTF("Server says: "+ str );
	}

}
