import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client
{
	public static void main(String[] args) throws Exception 
	{
		Socket s1=new Socket("127.0.0.1",9999);
		if(s1.isConnected())
		{
			System.out.println("Connected to server");
		}
		String str="Hello Server";
		DataOutputStream dout=new DataOutputStream(s1.getOutputStream());
		dout.writeUTF(str);
		DataInputStream din=new DataInputStream(s1.getInputStream());
		str = din.readUTF();
		System.out.println(str);
		Scanner sc = new Scanner(System.in);
		str = sc.next();
	}
}