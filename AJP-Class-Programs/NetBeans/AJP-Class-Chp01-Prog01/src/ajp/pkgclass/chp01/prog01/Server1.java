package ajp.pkgclass.chp01.prog01;
import java.io.*;
import java.net.*;
public class Server1 
{
public static void main(String[] args)
{
    try{
        ServerSocket ss = new ServerSocket(6666);
        System.out.println("Server is waiting for client request...");	
        Socket s = ss.accept();
        System.out.println("Connection established.");	
        DataInputStream din =
        new DataInputStream(s.getInputStream());
        String  str = (String)din.readUTF();
        System.out.println("Client: "+str);
        din.close();
        s.close();
        ss.close();
    }
    catch(Exception e)
    {System.out.println(e);}
}
}