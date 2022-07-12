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
  System.out.println("Waiting for Client to send a String.");
  Socket s = ss.accept();
  System.out.println("Connection established with Client.");     
  PrintStream p = new PrintStream(s.getOutputStream());   
  BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
  BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
  while(true)
  {   
   String str,str1;  
   while((str = br.readLine()) != null)  
   {   
       System.out.println("\n Count Of Characters & Digits In String Displayed ");   
       int countCha = 0,countNum = 0;  
       for(int i=0;i<str.length();i++)
       {
        if( (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') ||
        (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')     || (str.charAt(i) >= ' ') )
            countCha++;
        else if(str.charAt(i) >= '0' && str.charAt(i) <= '9')
            countNum++;
       }
       str1 = " Total Number Of Characters = " + countCha;
                     str1 += " Total Number Of Digits = " + countNum;  
    p.println(str1); 
   }       
   ss.close();
   s.close(); 
  } 
 }
}
