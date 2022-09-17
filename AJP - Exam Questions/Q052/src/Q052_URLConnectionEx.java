import java.io.*;
import java.net.*;

public class Q052_URLConnectionEx {
public static void main(String[] args) {
try{
        URL url = new URL("https://www.marwadieducation.edu.in/");
        URLConnection urlcon = url.openConnection();
        System.out.println("Connected to the URL.");
        InputStream stream = urlcon.getInputStream();
        System.out.println("Got the input stream from the URL connection.");
        int i;
        System.out.println("Response receieved:\n\n");
        BufferedReader in = new BufferedReader(
                                new InputStreamReader( urlcon.getInputStream() ) );
        String inputLine;
        while ((inputLine = in.readLine()) != null) 
            System.out.println(inputLine);
}
catch(Exception e) {System.out.println(e);}
}
}