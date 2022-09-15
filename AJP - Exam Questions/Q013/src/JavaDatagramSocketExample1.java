/**
 * Q013:
 * What is Datagram Socket? Explain in detail with an example.
 */
import java.net.*;
public class JavaDatagramSocketExample1 {  
public static void main(String[] args) throws Exception {  
    int port=1085;  
    InetAddress inetAddress= InetAddress.getByName("localhost");  
    DatagramSocket socket = new DatagramSocket(6666);  
    socket.connect(inetAddress,port);  
    System.out.println("Remote Socket Address: " 
            + socket.getRemoteSocketAddress());  
    System.out.println("Local port number: " 
            +socket.getLocalPort());  
    System.out.println("Port number: "+socket.getPort());  
    System.out.println("Address:"+socket.getInetAddress());  
    socket.close();  
    }  
}  

