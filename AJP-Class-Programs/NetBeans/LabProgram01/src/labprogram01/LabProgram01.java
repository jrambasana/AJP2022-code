package labprogram01;
import java.net.*;
public class LabProgram01 {
    public static void main(String[] args) throws Exception   {
        InetAddress ip = InetAddress.getLocalHost(); 
        System.out.println("Whole Address of this machine: " + ip);
        System.out.println("IP Address of this machine: " + ip.getHostAddress());
        System.out.println("Name of this machine: " + ip.getHostName());   
        String domain = "www.google.com";
        ip = InetAddress.getByName(domain);
        System.out.println("Address of : " + domain + " is: "+ ip);
        domain = "www.yahoo.com";
        InetAddress addresses[] = InetAddress.getAllByName(domain);
        for(int i=0; i<addresses.length; i++)
            System.out.println("Address of : " + domain + " is: "+ addresses[i]);
    }
}
