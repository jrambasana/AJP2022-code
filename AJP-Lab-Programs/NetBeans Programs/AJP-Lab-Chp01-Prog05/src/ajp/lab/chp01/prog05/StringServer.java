// Write a client program to send any string from its
// standard input to the server program. The server program reads the
// string, finds number of characters and digits and sends it back to
// client program. Use connection-oriented communication 
package ajp.lab.chp01.prog05;

import java.io.*;
import java.net.*;
class StringServer
{
 public static void main(String args[]) throws Exception
 {
  ServerSocket ss = new ServerSocket(3333);
  Socket s = ss.accept();
  System.out.println("Connection established with Client.");     
  PrintStream p = new PrintStream(s.getOutputStream());   
  BufferedReader br = 
          new BufferedReader(new InputStreamReader(s.getInputStream()));
  
   String str,str1;  
   do
   {   
      System.out.println("Waiting for Client to send a String.");
       str = br.readLine();
       int charCount = 0,numCount = 0;  
       for(int i=0;i<str.length();i++)
       {
        if(str.charAt(i) >= '0' && str.charAt(i) <= '9')
            numCount++;
        else if( (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') 
                || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') 
                || (str.charAt(i) == ' ') )
            charCount++;
       }
       str1 = "Total Number Of Characters = " + charCount;
       str1 += " | Total Number Of Digits = " + numCount;  
       p.println(str1); 
       System.out.println("Count of Characters & Digits in the String sent to Client.");   
   } while( !str.equals("stop") );

   ss.close();
   s.close(); 

 }
}
