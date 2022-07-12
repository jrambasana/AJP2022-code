// Write an application which will retrieve IP address for given website.

import java.net.*;
import java.util.Scanner;

public class InetAddressTest
{
    public static void main(String[] args)  throws UnknownHostException
    {
        InetAddress Address = InetAddress.getLocalHost();
        System.out.println("IP address of Localhost: " + Address);

        Address = InetAddress.getByName("www.google.com");
        System.out.println("IP address of Google: "+ Address);
        
        InetAddress SW[] = InetAddress.getAllByName("www.yahoo.com");
        for (int i=0; i<SW.length; i++)
            System.out.println("IP address of Yahoo: " + SW[i]);     

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a URL: ");
        String url = input.nextLine();
        
        Address = InetAddress.getByName(url);
        System.out.println("IP address of "+Address.getHostName()
        					+" is : "+Address.getHostAddress());
        
    }    
}
