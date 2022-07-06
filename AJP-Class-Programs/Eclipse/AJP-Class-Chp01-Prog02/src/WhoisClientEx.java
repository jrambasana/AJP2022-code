import java.io.*;
import java.net.*;

public class WhoisClientEx {
	public static void main(String args[  ]) throws Exception {
		int c;
		String str = "whois.internic.net";
		System.out.println("Connecting to " + str);
		Socket s = new Socket(str, 43);
		InputStream in = s.getInputStream();
		OutputStream out = s.getOutputStream();
		String str2="www.google.com";
		byte buf[] = str2.getBytes();
		out.write(buf);
		while ((c = in.read()) != -1) 
			System.out.print((char) c);
		s.close();
		}
}
