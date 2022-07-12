/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajp.lab.chp01.prog05;

import java.io.*;
import java.net.*;
class StringClient
{
 public static void main(String args[]) throws Exception
 {    
  Socket s = new Socket("localhost", 3333);
  int stop = 1;
  DataOutputStream dout = new
DataOutputStream(s.getOutputStream());
  BufferedReader  br = new BufferedReader(new InputStreamReader(s.getInputStream()));
  BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
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
  }while(stop != 1);
  dout.close();
  br.close(); 
  kb.close();
  s.close();
 }
}  