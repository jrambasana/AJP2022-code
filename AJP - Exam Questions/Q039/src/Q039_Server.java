/**
 * Q039:
 * Write a Client-Server program using TCP or UDP where 
 * the client sends 10 numbers and 
 * server responds with the numbers in sorted order.
 */
import java.io.*;
import java.net.*;
public class Q039_Server
{
    public static void main(String args[]) throws Exception
    {
        ServerSocket ss=new ServerSocket(2525);
        System.out.println("Server waiting...");
        Socket s=ss.accept();
        DataInputStream din=new DataInputStream(s.getInputStream());
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        int x,i=0;
        int n=din.readInt();
        int a[]=new int[n];
        System.out.println("Data received:");
        int count=0;
        for(i=0;i<n;i++)
        {
            a[i]=din.readInt();
            System.out.println(a[i] + " ");
        }
        int number = a.length;
        for (int i1 = 0; i1 < number-1; i1++){
            for (int j1 = 0; j1 < number-i1-1; j1++)
            {
                if (a[j1] > a[j1+1])
                {
                    int temp = a[j1];
                    a[j1] = a[j1+1];
                    a[j1+1] = temp;
                }
            }
        }
        for(i=0;i<n;i++) {
            dout.writeInt(a[i]);
        }
        s.close();
        ss.close();
    }
}
