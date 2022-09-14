/**
 * Q040:
 * Develop a program to implement one way communication 
 * using Connection-oriented programming technique in Java.
 */
import java.io.*;
import java.net.*;
public class OneWay_Client {
public static void main(String[] args)
{
    try{
        Socket s=new Socket("localhost",6666);
        DataOutputStream dout =
            new DataOutputStream(s.getOutputStream());
        dout.writeUTF("Hello Server");
        dout.flush();
        dout.close();
        s.close();
    }
    catch(Exception e){System.out.println(e);}
}
}

