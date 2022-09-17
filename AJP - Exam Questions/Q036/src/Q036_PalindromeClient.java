import java.io.*;
import java.net.*;

public class Q036_PalindromeClient {
public static void main(String[] args) throws UnknownHostException, IOException {
    Socket s = new Socket(InetAddress.getLocalHost(),5555);
    DataInputStream dis = new DataInputStream(s.getInputStream());
    DataOutputStream dos = new DataOutputStream(s.getOutputStream());
    String str = "ARDRA";
    System.out.println("Passing a String to Server:" + str);
    dos.writeUTF(str);
    System.out.println(dis.readUTF());
    s.close();
}  
}
