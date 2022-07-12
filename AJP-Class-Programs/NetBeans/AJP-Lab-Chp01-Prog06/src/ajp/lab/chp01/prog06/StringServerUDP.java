// Write a client program to send any string from its
// standard input to the server program. The server program reads the
// string, finds number of characters and digits and sends it back to
// client program. Use connection-less communication 
package ajp.lab.chp01.prog06;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class StringServerUDP 
{
public static void main(String[] args) 
{
      try {
          DatagramSocket ds = new DatagramSocket(3000);
          byte [] buf = new byte[100];
          DatagramPacket dp = new DatagramPacket(buf, 100);
          System.out.println("Waiting for Client to send a String.");
          ds.receive(dp);

          String str = new String(dp.getData(), 0, dp.getLength());

          int charCount =0, digitCount = 0;

          for(int i =0;i<str.length();i++)
          {
              if( (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') ||
                  (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= ' ') )
                  charCount++;
              if(str.charAt(i)>='0'&&str.charAt(i)<='9')
                  digitCount++;
          }

          System.out.println("Client String : "+str);
          System.out.println("Characters Count : "+charCount);
          System.out.println("Digits Count : "+digitCount);

          ds.close();

      } catch (Exception e) {
      }
  }
} 
