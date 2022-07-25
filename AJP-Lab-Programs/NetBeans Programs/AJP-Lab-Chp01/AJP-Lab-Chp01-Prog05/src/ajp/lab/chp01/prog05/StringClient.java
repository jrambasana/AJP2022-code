// Write a client program to send any string from its
// standard input to the server program. The server program reads the
// string, finds number of characters and digits and sends it back to
// client program. Use connection-oriented communication 
package ajp.lab.chp01.prog05;

import java.io.*;
import java.net.*;
class StringClient
{
 public static void main(String args[]) throws Exception
 {    
  Socket s = new Socket("localhost", 3333);
  DataOutputStream dout = new
            DataOutputStream(s.getOutputStream());
  BufferedReader  br = 
          new BufferedReader(new InputStreamReader(s.getInputStream()));
  BufferedReader kb = 
          new BufferedReader(new InputStreamReader(System.in));
  String str="",str1="";  
  do
  {
   System.out.print("Enter String for sending to Server: ");
   str = kb.readLine();
   dout.writeBytes(str+"\n");  
   str1 = br.readLine(); 
   System.out.println("\n");
   System.out.println("The String returned from Server is: ");
   System.out.println(str1);
  }while(!str.equals("stop"));
  dout.close();
  br.close(); 
  kb.close();
  s.close();
 }
}  