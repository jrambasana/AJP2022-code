import java.rmi.*;
import java.rmi.registry.*;

public class MyServer{

public static void main(String args[]){
try{

Adder stub=new AdderRemote();
Naming.rebind("rmi://localhost:9999/sum",stub);

}catch(Exception e){System.out.println(e);}
}

}
