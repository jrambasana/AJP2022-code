// Write an application which will retrieve IP address for given website.

package ajp.prog01;

import java.net.*;
import java.util.Scanner;

public class InetAddressTest2
{
    public static void main(String[] args)  throws UnknownHostException
    {
        InetAddress Address = InetAddress.getLocalHost();
        System.out.println("IP address of Localhost: " + Address);
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a URL: ");
        String url = input.nextLine();
        
        Address = InetAddress.getByName(url);
        System.out.println("IP address of "+url+" is : "+Address);
       
    }    
}