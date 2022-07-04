package ajp.prog01;

import java.net.*;

public class InetAddressTest
{
    public static void main(String[] args)  throws UnknownHostException
    {
        InetAddress Address = InetAddress.getLocalHost();
        System.out.println("Localhost IP address: " + Address);

    }    
}
