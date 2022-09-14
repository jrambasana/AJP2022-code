/**
 * Q061:
 * Explain the following classes with their use. 
 * (i) URLConnection class 
 * (ii) DatagramSocket and DatagramPacket classes
 */
import java.io.*;
import java.net.*;  
public class Q061B2_DatagramReceiver { 
public static void main(String[] args) 
throws Exception 
{  
    DatagramSocket ds = new DatagramSocket(3000);  
    byte[] buf = new byte[1024];  
    System.out.println("Receiver Program");
    DatagramPacket dp = new DatagramPacket(buf, 1024);  
    ds.receive(dp);  
    String str = new String(dp.getData(), 0, dp.getLength());  
    System.out.println("Sender says: "+ str);  
    ds.close();  
}  
} 
