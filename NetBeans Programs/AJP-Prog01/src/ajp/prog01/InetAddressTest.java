package ajp.prog01;

import java.net.*;

public class InetAddressTest
{
    public static void main(String[] args)  throws UnknownHostException
    {
        InetAddress Address = InetAddress.getLocalHost();
        System.out.println("Localhost IP address: " + Address);

        Address = InetAddress.getByName("www.google.com");
        System.out.println("Google IP address: "+ Address);
        InetAddress SW[] = InetAddress.getAllByName("www.yahoo.com");
        for (int i=0; i<SW.length; i++)
            System.out.println("Yahoo IP address: " + SW[i]);        
    }    
}
