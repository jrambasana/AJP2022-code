// Write an application	which will retrieve file from server machine
// and save that file on client machine.
// File name will be provided by client.


import java.io.*; 
import java.net.*;
public class FileClient
{
public static void main(String args[ ]) throws Exception
{
Socket s = new Socket("localhost", 8888);
BufferedReader kb = new BufferedReader(new
                            InputStreamReader(System.in));
System.out.print("Enter filename: ");
String fname = kb.readLine();
DataOutputStream out = 
        new DataOutputStream(s.getOutputStream());
out.writeBytes(fname+"\n");
BufferedReader  in = new BufferedReader(
        new InputStreamReader(s.getInputStream()));
String str;
str = in.readLine();

//FileWriter fwriter = new FileWriter(new File("C://A//File2.txt"));

if(str.equals("Yes"))
{    
    System.out.println("Displaying the File content sent by Server.");
    while((str = in.readLine()) != null)
    {
        System.out.println(str);
//        fwriter.append(str);
//        fwriter.flush();
    }
//    fwriter.close();
    kb.close();
    out.close();
    in.close();
    s.close();
}
else 
        System.out.println("File not found");
}
} 