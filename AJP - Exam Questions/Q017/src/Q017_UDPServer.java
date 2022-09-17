import java.io.*;
import java.net.*;

public class Q017_UDPServer {
public static void main(String args[])
{        
    try
    {
        //1. creating a server socket, parameter is local port number
         DatagramSocket serverDGSocket = new DatagramSocket(7777);
        //buffer to receive incomingPacket data
        byte[] buffer = new byte[65536];
        DatagramPacket incomingPacket = new DatagramPacket(buffer,    buffer.length);     

        //2. Wait for an incomingPacket data
        System.out.println("Server socket created. Waiting for incoming data...");           

        serverDGSocket.receive(incomingPacket);
        String received = new String(incomingPacket.getData());
        System.out.println("The time of client is :" + received);
        serverDGSocket.close();
    }           
    catch(IOException e)
    {     System.err.println("IOException " + e);     }
}
}
