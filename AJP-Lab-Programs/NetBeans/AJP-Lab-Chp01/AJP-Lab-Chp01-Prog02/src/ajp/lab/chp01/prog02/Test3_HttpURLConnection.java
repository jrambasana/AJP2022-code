package ajp.lab.chp01.prog02;

import java.io.*;    
import java.net.*;    

public class Test3_HttpURLConnection {
public static void main(String[] args){    
    try{    
        URL url=new URL("https://login.marwadiuniversity.ac.in:553/");    
        HttpURLConnection huc=(HttpURLConnection)url.openConnection();  
        for(int i=1;i<=8;i++){  
            System.out.println( huc.getHeaderFieldKey(i)
                        +" = "+huc.getHeaderField(i) );  
        }  
        huc.disconnect();   
    }catch(Exception e){System.out.println(e);}    
}    
}    