import java.io.*;
import java.net.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;  

public class Q017_UDPClient {
public static void main(String args[]) throws IOException
{
    int port = 7777;    
    DatagramSocket sock = new DatagramSocket();             
    InetAddress host = InetAddress.getByName("localhost");

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
    LocalDateTime now = LocalDateTime.now(); 

    String s = now.toString();
    System.out.println(s);

    byte[] b = s.getBytes();

    DatagramPacket datagram = new DatagramPacket(b, b.length, host, port);
    DatagramPacket  dp = new DatagramPacket(b , b.length , host , port);
    sock.send(dp); 
    sock.close();
}     
}
