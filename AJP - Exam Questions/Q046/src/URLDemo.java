/**
 * Q046:
 * Explain URL class with a small example. 
 * Identify different parts of an URL in the given URL: 
 * http://www.java.com:80/javaintro/index.jsp?name=abc
 */
import java.io.*;  
import java.net.*;  
public class URLDemo{  
public static void main(String[ ] args){  
try{  
    URL url = 
    new URL("http://www.marwadiuniversity.ac.in:553/Login");  
    System.out.println("Protocol: "+url.getProtocol());  
    System.out.println("Host Name: "+url.getHost());  
    System.out.println("Port Number: "+url.getPort());  
    System.out.println("File Name: "+url.getFile());   
}
catch(Exception e){System.out.println(e);}  
}  
} 
