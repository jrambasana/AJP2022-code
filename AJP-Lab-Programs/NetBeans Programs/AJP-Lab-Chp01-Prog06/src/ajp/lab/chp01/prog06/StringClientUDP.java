/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajp.lab.chp01.prog06;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class StringClientUDP 
{
public static void main(String[] args) throws Exception
 {
    DatagramSocket ds = new DatagramSocket();

    Scanner s = new Scanner(System.in);
    System.out.print("Enter String for sending to Server: ");
    String str = s.nextLine();

    InetAddress ip = InetAddress.getByName("localhost");  

    DatagramPacket dp1 = new DatagramPacket(str.getBytes(), str.length(), ip, 3000);  
    ds.send(dp1); 

    ds.close();
 }
}

