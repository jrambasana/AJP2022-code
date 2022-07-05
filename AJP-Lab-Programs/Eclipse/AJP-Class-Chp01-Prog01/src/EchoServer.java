import java.io.*;
import java.net.*;
public class EchoServer {
	public static void main(String[] args){
		try{
		ServerSocket ss=new ServerSocket(6666);
		System.out.println("Server is strated.");	
		Socket s=ss.accept();
		System.out.println("Connection established.");	
		DataInputStream dis =
		new DataInputStream(s.getInputStream());
		String  str=(String)dis.readUTF();
		System.out.println("message= "+str);
		ss.close();
		}
		catch(Exception e)
		{System.out.println(e);}
		}
}