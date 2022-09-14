/**
 * Q039:
 * Write a Client-Server program using TCP or UDP where 
 * the client sends 10 numbers and 
 * server responds with the numbers in sorted order.
 */
import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Q039_Client 
{
    public static void main(String[] args) throws Exception
    {
        Socket s=new Socket("localhost",2525);
        System.out.println("Enter the size of array:");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements of array:");
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        dout.writeInt(n);
        for(int i=0;i<n;i++)
        {
            int x=scanner.nextInt();;
            dout.writeInt(x);
        }
        DataInputStream din=new DataInputStream(s.getInputStream());
        int x;
        System.out.println("Sorted Array from server:");
        for(int i=0;i<n;i++)
        {
            x=din.readInt();
            System.out.print(x+" ");
        }
        s.close();
    }
}

