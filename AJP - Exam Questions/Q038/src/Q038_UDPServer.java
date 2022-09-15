/**
 * Q038:
 * Write a client-server program using UDP socket. 
 * Client sends the list of N strings and server responds 
 * with the concatenation of those strings.
 */
import java.net.*;
public class Q038_UDPServer {
public static void main(String[] args) {
try {
    DatagramSocket ds = new DatagramSocket(3001);
    byte [] buf = new byte[100];
    DatagramPacket dp1 = new DatagramPacket(buf, 100);
    String result = "";
    String str = "";
    while(!str.equals("stop"))
    {
        System.out.println("Waiting for Client to send a String.");
        ds.receive(dp1);
        str = new String(dp1.getData(), 0, dp1.getLength());
        System.out.println("String received from Client side: " + str);
        result = result+str;
        DatagramPacket dp2 = 
            new DatagramPacket(result.getBytes(), result.length(),
                    InetAddress.getByName("localhost"), 3000); 
        ds.send(dp2);
    }
    ds.close();
} catch (Exception e) 
{ System.out.println(e); }
}
}
