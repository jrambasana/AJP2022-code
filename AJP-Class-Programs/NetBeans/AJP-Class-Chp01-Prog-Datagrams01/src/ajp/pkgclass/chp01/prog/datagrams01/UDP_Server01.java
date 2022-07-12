package ajp.pkgclass.chp01.prog.datagrams01;
import java.io.*;
import java.net.*; 

public class UDP_Server01 
{
public static void main(String args[])
{
    DatagramSocket serverDGSocket = null;         
    try
    {
        //1. creating a server socket, parameter is local port number
        serverDGSocket = new DatagramSocket(7777);
        //buffer to receive incomingPacket data
        byte[] buffer = new byte[65536];
        DatagramPacket incomingPacket = new DatagramPacket(buffer, buffer.length);             
        //2. Wait for an incomingPacket data
        System.out.println("Server socket created. Waiting for incoming data...");           
        //communication loop
        while(true)
        {
            serverDGSocket.receive(incomingPacket);
            byte[] data = incomingPacket.getData();
            String s = new String(data, 0, incomingPacket.getLength());        
             //echo the details of incomingPacket data - client ip : client port - client message
            System.out.println(incomingPacket.getAddress().getHostAddress() 
                    + " : " + incomingPacket.getPort() + " - " + s);                 
            s = "OK : " + s;
            DatagramPacket dp = new DatagramPacket(s.getBytes() , s.getBytes().length , incomingPacket.getAddress() , incomingPacket.getPort());
            serverDGSocket.send(dp);      
        }           
    }         
    catch(IOException e)
    {     System.err.println("IOException " + e);     }
}
}


            
