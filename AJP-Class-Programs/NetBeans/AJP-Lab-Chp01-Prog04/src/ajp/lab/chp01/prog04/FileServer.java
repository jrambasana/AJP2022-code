// Write an application which will retrieve file from server machine	
// and save that file on client machine.
// File name will be provided by client.
package ajp.lab.chp01.prog04;

import java.io.*; 
import java.net.*;
class FileServer
{
public static void main(String args[ ]) throws Exception
{
    ServerSocket ss = new ServerSocket(8888);
    System.out.println("Waiting for Client's connection request");
    Socket s = ss.accept();
    System.out.println("Connection established");
    BufferedReader in = new BufferedReader(
            new InputStreamReader(s.getInputStream())); 
    DataOutputStream out = new DataOutputStream(s.getOutputStream());
    String fname = in.readLine();
    FileReader fr = null;
    BufferedReader file = null;
    boolean flag;
    File f = new File(fname);
    System.out.println("Request arrived for Reading the File:" + fname);
    if(f.exists()) 
            flag = true;
    else 
            flag = false;

    if(flag == true) 
            out.writeBytes("Yes"+"\n");
    else 
            out.writeBytes("No"+"\n");
    if(flag == true)
    {
            System.out.println("Server started reading the File.");
            fr = new FileReader(fname);
            file = new BufferedReader(fr);
            String str;
            while((str = file.readLine()) != null)
            {
                    out.writeBytes(str+"\n");
            }
            System.out.println("File sent to client.");
            file.close(); 
            out.close();
            in.close();
            fr.close();
            s.close();
            ss.close();
    }
}
}
