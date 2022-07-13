// Write an application	which will retrieve file from server machine
// and save that file on client machine.
// File name will be provided by client.
package ajp.lab.chp01.prog04;

import java.io.*; 
import java.net.*;
class FileClient
{
public static void main(String args[ ]) throws Exception
{
    Socket s = new Socket("localhost", 8888);
    BufferedReader kb = new BufferedReader(new
                                InputStreamReader(System.in));
    System.out.print("Enter filename: ");
    String fname = kb.readLine();
    DataOutputStream out = new DataOutputStream(s.getOutputStream());
    out.writeBytes(fname+"\n");
    BufferedReader  in = new BufferedReader(
            new InputStreamReader(s.getInputStream()));
    String str;
    str = in.readLine();
    if(str.equals("Yes"))
    {    
            System.out.println("Displaying the File content sent by Server.");
            while((str = in.readLine()) != null)
                    System.out.println(str);
            kb.close();
            out.close();
            in.close();
            s.close();
    }
    else 
            System.out.println("File not found");
}
} 