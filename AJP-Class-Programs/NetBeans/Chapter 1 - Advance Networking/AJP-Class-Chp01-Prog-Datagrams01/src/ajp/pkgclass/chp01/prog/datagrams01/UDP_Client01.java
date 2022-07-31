package ajp.pkgclass.chp01.prog.datagrams01;

import java.io.*;
import java.net.*; 

public class UDP_Client01 
{
public static void main(String args[])
{
    DatagramSocket clientDGSocket = null;
    int port = 7777;
    String s;         
    BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));    
    try
    {
        clientDGSocket = new DatagramSocket();             
        InetAddress host = InetAddress.getByName("localhost");
        System.out.println(" ======================= CLIENT SIDE ======================= ");
        while(true)        
        {
            //take input and send the packet
            System.out.println("Enter message to send : ");
            s = (String)cin.readLine();
            byte[] b = s.getBytes();
            DatagramPacket  outgoingPacket = new DatagramPacket(b , b.length , host , port);
            clientDGSocket.send(outgoingPacket);     
            System.out.println("Outgoing: " + outgoingPacket.getAddress().getHostAddress() 
                                + " : " + outgoingPacket.getPort());   
            //now receive incomingPacket
            //buffer to receive incoming data
            byte[] buffer = new byte[65536];
            DatagramPacket incomingPacket = new DatagramPacket(buffer, buffer.length);
            clientDGSocket.receive(incomingPacket); 
            s = new String(incomingPacket.getData(), 0, incomingPacket.getLength());

            //echo the details of incoming data - client ip : client port - client                       message
            System.out.println("Incoming: " + incomingPacket.getAddress().getHostAddress() 
                    + " : " + incomingPacket.getPort() + " - "        + s); 
        } 
    }
    catch(IOException e)
    {
        System.err.println("IOException " + e);        
    }
}
}

