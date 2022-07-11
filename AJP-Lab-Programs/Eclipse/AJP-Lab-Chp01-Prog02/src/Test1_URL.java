import java.io.*;
import java.net.*;
public class Test1_URL
{
	public static void main(String[] args)
	{
	    try     {
	        String str = "https://www.marwadiuniversity.ac.in/bachelor-of-engineering/computer-engineering/";
//	        String str = "https://www.marwadiuniversity.ac.in/wp-content/uploads/2018/08/01ce0502-advanced-java-programming.pdf";
//	        String str = "https://emp.marwadiuniversity.ac.in:553/AdminControl/PutAttendance.aspx";
//	        String str = "https://www.google.com/search?q=Marwadi+University&oq=Marwadi+University&sourceid=chrome&ie=UTF-8";
	        URL url = new URL(str);
	        System.out.println("Protocol: "+url.getProtocol());    
	        System.out.println("Host Name: "+url.getHost());    
	        System.out.println("Port Number: "+url.getPort());    
	        System.out.println("Default Port Number: "+url.getDefaultPort());    
	        System.out.println("Query String: "+url.getQuery());    
	        System.out.println("Path: "+url.getPath());    
	        System.out.println("File: "+url.getFile()); 
	    }
	    catch(Exception e)    {
	            System.out.println(e);
	    }
	}
} 