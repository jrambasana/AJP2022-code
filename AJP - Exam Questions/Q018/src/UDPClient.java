/**
 * Q018:What is a Datagram Packet? Explain in Detail With Example.
 */
import java.io.*;
import java.net.*;
public class UDPClient {
public static void main(String[] args) throws SocketException, UnknownHostException, IOException {
        DatagramSocket ds = new DatagramSocket();
        String msg="Hello From Client";
        DatagramPacket dp = 
            new DatagramPacket (msg.getBytes(), msg.length(), 
                InetAddress.getLocalHost(), 5555);
        ds.send(dp);
    }
}
