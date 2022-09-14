/**
 * Q061:
 * Explain the following classes with their use. 
 * (i) URLConnection class 
 * (ii) DatagramSocket and DatagramPacket classes
 */
import java.net.*;
import java.io.*;
public class Q061A_URLConnectionReader {
    public static void main(String[] args) throws Exception {
        URL yahoo = new URL("http://www.google.com/");
        URLConnection yc = yahoo.openConnection();
        BufferedReader in = new BufferedReader(
            new InputStreamReader(yc.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) 
            System.out.println(inputLine);
        in.close();
    }
}
