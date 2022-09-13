/**
 * Q072:
 * Write a client-server program using UDP socket. 
 * Client sends the list of N strings and server responds as the 
 * concatenation of those strings.
 */
import java.io.*;
import java.net.*;
import java.util.*;
public class Server
{
public static void main(String args[]) throws IOException
{
    ServerSocket ss=new ServerSocket(777);
    Socket s=ss.accept();
    String str,str_in,str_out="";
    BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
    PrintStream ps=new PrintStream(s.getOutputStream());
    int length = Integer.parseInt(br.readLine());
    for(int i=0 ; i<length ; i++)
    {
        str_in = br.readLine();
        str_out = str_out + str_in;
        System.out.println("Client sent: " + str_in);
        ps.println(str_out);
    }
    ps.close();
    ss.close();
    s.close();
}
}