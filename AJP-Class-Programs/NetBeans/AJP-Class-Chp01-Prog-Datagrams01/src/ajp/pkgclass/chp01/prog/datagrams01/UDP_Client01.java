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
        while(true)        {
            //take input and send the packet
            System.out.println("Enter message to send : ");
            s = (String)cin.readLine();
            byte[] b = s.getBytes();
            DatagramPacket  dp = new DatagramPacket(b , b.length , host , port);
            clientDGSocket.send(dp);                 
            //now receive reply
            //buffer to receive incoming data
            byte[] buffer = new byte[65536];
            DatagramPacket reply = new DatagramPacket(buffer, buffer.length);
            clientDGSocket.receive(reply); 
            byte[] data = reply.getData();
            s = new String(data, 0, reply.getLength());

            //echo the details of incoming data - client ip : client port - client                       message
            System.out.println(reply.getAddress().getHostAddress() 
                    + " : " + reply.getPort() + " - "        + s); 
        } 
    }
    catch(IOException e)
    {
        System.err.println("IOException " + e);        
    }
}
}

