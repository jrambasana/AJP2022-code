import java.io.*;
import java.net.*;
public class URLTest
{
	public static void main(String[] args)
	{
		try 
		{
			String str = "https://marwadieducation.edu.in/MEFOnline/";
			// Also try "https://emp.marwadiuniversity.ac.in:553/ControlPages/AttendanceControl.aspx"
			
			URL url = new URL(str);
			
			System.out.println("Protocol: "+url.getProtocol());
			System.out.println("Host Name: "+url.getHost());
			System.out.println("Port Number: "+url.getPort());
			System.out.println("File Name with Path: "+url.getFile());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
} 