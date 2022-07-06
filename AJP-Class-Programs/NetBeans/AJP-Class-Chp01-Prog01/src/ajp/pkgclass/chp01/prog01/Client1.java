package ajp.pkgclass.chp01.prog01;
import java.io.*;  
import java.net.*;  
public class Client1 
{  
    public static void main(String[] args) 
    {  
        try{      
            System.out.println("Connectioned initiated with setver.");	
            Socket s = new Socket("localhost",6666);  
            System.out.println("Connectioned established.");	
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Hello Server");  
            dout.flush();  
            dout.close();  
            s.close();  
        }
        catch(Exception e){System.out.println(e);} 
    }  
}
