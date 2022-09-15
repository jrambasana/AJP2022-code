/**
 * Q041:
 * Develop a program to implement two way communication 
 * using Connection-oriented programming technique in Java.
 */
import java.net.*;  
import java.io.*;  
public class TwoWay_Server
{  
public static void main(String args[])throws Exception
{  
    ServerSocket ss=new ServerSocket(3333);  
    System.out.println("Server started.");  

    Socket s=ss.accept();  
    DataInputStream din=new DataInputStream(s.getInputStream());  
    DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
    String str1="",str2="";  
    while(!str1.equals("stop"))
    {  
        System.out.println("Waiting for Client's messsage...");  
        str1 = din.readUTF();  
        System.out.println("Client: "+str1);  
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