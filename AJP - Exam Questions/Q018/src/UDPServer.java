/**
 * Q018:What is a Datagram Packet? Explain in Detail With Example.
 */
import java.io.*;
import java.net.*;
public class UDPServer {
public static void main(String[] args) throws SocketException, IOException {
    DatagramSocket ds = new DatagramSocket(5555);
    byte[] buffer = new byte[1024];
    DatagramPacket dp = new DatagramPacket(buffer, buffer.length); 
    ds.receive(dp);
    System.out.println("Client: " + new String(dp.getData(), 0, buffer.length));
}   
}
