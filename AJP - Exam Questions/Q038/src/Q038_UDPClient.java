/**
 * Q038:
 * Write a client-server program using UDP socket. 
 * Client sends the list of N strings and server responds 
 * with the concatenation of those strings.
 */
import java.net.*;
import java.io.*;
import java.util.Scanner;
public class Q038_UDPClient 
{
public static void main(String[] args) throws Exception
{
    DatagramSocket ds = new DatagramSocket(3000);
    Scanner s = new Scanner(System.in);
    String str="";
    while(!str.equals("stop"))
    {
        System.out.print("Enter String to concat. To stop enter 'stop': ");
        str = s.nextLine();
        InetAddress ip = InetAddress.getByName("localhost");  
        DatagramPacket dp1 = new DatagramPacket(str.getBytes(),
                             str.length(), ip, 3001);  
        ds.send(dp1);
        DatagramPacket dp2 = new DatagramPacket(new byte[1024], 1024);
        ds.receive(dp2);
        String result = new String(dp2.getData(), 0, dp2.getLength());
        System.out.println("Concatenated String from the Server: " + result);
    }
    ds.close();
}
}

