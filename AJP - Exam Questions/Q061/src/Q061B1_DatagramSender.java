/**
 * Q061:
 * Explain the following classes with their use. 
 * (i) URLConnection class 
 * (ii) DatagramSocket and DatagramPacket classes
 */
import java.io.*;
import java.net.*;  
public class Q061B1_DatagramSender {
public static void main(String[] args) throws Exception {  
    DatagramSocket ds = new DatagramSocket();  
    System.out.println("Sender Program");
    String str = "Hello Datagrams";  
    InetAddress ip = InetAddress.getByName("127.0.0.1");  
    DatagramPacket dp = new DatagramPacket(str.getBytes(), 					str.length(), ip, 3000);  
    ds.send(dp);  
    ds.close();  
}  
} 
