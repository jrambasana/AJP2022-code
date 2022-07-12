package ajp.pkgclass.chp01.prog.datagrams01;
import java.io.*;
import java.net.*; 

public class UDP_Server01 
{
public static void main(String args[])
{
    DatagramSocket sock = null;         
    try
    {
        //1. creating a server socket, parameter is local port number
        sock = new DatagramSocket(7777);
        //buffer to receive incoming data
        byte[] buffer = new byte[65536];
        DatagramPacket incoming = new DatagramPacket(buffer, buffer.length);             
        //2. Wait for an incoming data
        System.out.println("Server socket created. Waiting for incoming data...");           
        //communication loop
        while(true)
        {
            sock.receive(incoming);
            byte[] data = incoming.getData();
            String s = new String(data, 0, incoming.getLength());        
             //echo the details of incoming data - client ip : client port - client message
            System.out.println(incoming.getAddress().getHostAddress() + " : " + incoming.getPort() + " - " + s);                 
            s = "OK : " + s;
            DatagramPacket dp = new DatagramPacket(s.getBytes() , s.getBytes().length , incoming.getAddress() , incoming.getPort());
            sock.send(dp);      }           }         
    catch(IOException e)
    {     System.err.println("IOException " + e);     }
}
}


            
