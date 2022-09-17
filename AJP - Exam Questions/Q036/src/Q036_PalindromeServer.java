import java.io.*;
import java.net.*;

public class Q036_PalindromeServer {
public static void main(String[] args) throws IOException {
    ServerSocket ss = new ServerSocket(5555);
    System.out.println("Waiting for a String from Client...");
    Socket s = ss.accept();
    java.io.DataInputStream dis = new DataInputStream(s.getInputStream());
    DataOutputStream dos = new DataOutputStream(s.getOutputStream());
    String ip = dis.readUTF();
    System.out.println("String from Client: "+ip);
    if(ip.equals(new StringBuilder(ip).reverse().toString()))
    {
        dos.writeUTF("It is a Palindrome");
    }
    else
        dos.writeUTF("It is not a Not Palindrome");
    s.close();
    ss.close();
 }
}
