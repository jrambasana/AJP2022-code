import java.io.*;
import java.net.*;

public class DayTime{
  public static void main(String[] args) throws Exception  
  {
	String server = "1.in.pool.ntp.org"; // Refer https://www.ntppool.org/en/ for more Time server URLs
	System.out.println("Connection request sent to " + server);
	Socket theSocket = new Socket(server, 13);
	InputStream timeStream =theSocket.getInputStream();
	StringBuffer time = new StringBuffer( );
	int c;
	while ((c = timeStream.read( )) != -1) 	
		time.append((char) c);
	String timeString = time.toString( ).trim( );  
	System.out.println("It is " + timeString + " at " + theSocket.getInetAddress().getHostName());
  }
}

