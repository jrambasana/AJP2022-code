/**
 * Q040:
 * Develop a program to implement one way communication 
 * using Connection-oriented programming technique in Java.
 */
import java.io.*;
import java.net.*;
public class OneWay_Server {
public static void main(String[] args){
    try{
        ServerSocket ss=new ServerSocket(6666);
        Socket s=ss.accept();
        DataInputStream din =
        new DataInputStream(s.getInputStream());
        String str=(String)din.readUTF();
        System.out.println("Client: "+str);
        din.close();
        s.close();
        ss.close();
    }
    catch(Exception e)
    {System.out.println(e);}
}
}
