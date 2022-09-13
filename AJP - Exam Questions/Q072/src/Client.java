/**
 * Q072:
 * Write a client-server program using UDP socket. 
 * Client sends the list of N strings and server responds as the 
 * concatenation of those strings.
 */
import java.io.*;
import java.net.*;
import java.util.*;
public class Client
{
public static void main(String args[]) throws Exception
{
    Socket s=new Socket("localhost",777);
    String str[]={"Hello ","I ","am ","a ","Student ","of ", "a ", "Marwadi University ","Rajkot "};
    BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
    PrintStream ps=new PrintStream(s.getOutputStream());
    ps.println(str.length);
    for(int i=0;i<str.length;i++)
    { 
        ps.println(str[i]); 
    }
    String str_in;
    while((str_in=br.readLine())!=null)
    {
        System.out.println("Server replied : " +str_in);
    }
    ps.close();
    s.close();
}
}
