package labprogram02;

import java.io.*;
import java.net.*;
public class LabProgram02_2 {
public static void main(String[] args) {
    try{
        URL url = new URL("https://login.marwadiuniversity.ac.in:553/");
        URLConnection urlcon = url.openConnection();
        System.out.println("Connected to the URL.");
        InputStream stream = urlcon.getInputStream();
        System.out.println("Got the input stream from the URL connection.");
        int i;
        System.out.println("Response receieved:\n\n");
        while( ( i = stream.read() ) != -1 ) 	
                System.out.print((char)i);
    }
    catch(Exception e)
    {System.out.println(e);}
}
}