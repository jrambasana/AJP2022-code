// Write a client program to send any string from its
// standard input to the server program. The server program reads the
// string, finds number of characters and digits and sends it back to
// client program. Use connection-less communication 
package ajp.lab.chp01.prog06;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class StringServerUDP2 
{
public static void main(String[] args) 
{
try {
    DatagramSocket ds = new DatagramSocket(3001);
    byte [] buf = new byte[100];
    DatagramPacket dp1 = new DatagramPacket(buf, 100);
    System.out.println("Waiting for Client to send a String.");
    ds.receive(dp1);
    System.out.println("String received from Client side.");
    String str = new String(dp1.getData(), 0, dp1.getLength());
    int charCount = 0, digitCount = 0;
    int specialCount = 0;
    for(int i =0;i<str.length();i++)    {
        if(str.charAt(i)>='0' && str.charAt(i)<='9')
            digitCount++;
        else if( (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') ||
                 (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) == ' ') )
            charCount++;
            else if (  str.charAt(i) == '!' ||  str.charAt(i) == '@' || str.charAt(i) == '#'
                    || str.charAt(i) == '%' || str.charAt(i) == '^' || str.charAt(i) == '&'
                    || str.charAt(i) == '*' || str.charAt(i) ==  '(' || str.charAt(i) == ')'
                    || str.charAt(i) == '-' || str.charAt(i) == '_' || str.charAt(i) == '+'
                    || str.charAt(i) == '=' || str.charAt(i) == '~' || str.charAt(i) == '`')
                specialCount++;
    }
    System.out.println("Client String : "+str);
    System.out.println("Characters Count : "+charCount);
    System.out.println("Digits Count : "+digitCount);
    System.out.println("Special Count : "+specialCount);

    String result = " Characters Count : " + charCount
                   +"\n Digits Count     : " + digitCount
                   +"\n Special Count    : " + specialCount;
    
    System.out.println("Address dp1: " + dp1.getAddress());
    System.out.println("Address ds : " + ds.getInetAddress());
    System.out.println("Buffer data: " + result.getBytes());
    System.out.println("Buffer data length: " + result.length());
    
    
    DatagramPacket dp2 = 
        new DatagramPacket(result.getBytes(), result.length(),
                InetAddress.getByName("localhost"), 3000); 
    ds.send(dp2);
    ds.close();

} catch (Exception e) {
    System.out.println(e);
}
}
} 
