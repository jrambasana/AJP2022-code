import java.rmi.*;
import java.rmi.registry.*;

public class MyServer{

public static void main(String args[]){
try{

    System.setProperty("java.rmi.server.hostname","127.0.0.1");
    Adder stub = new AdderRemote();
    // Naming.rebind("rmi://localhost:8999/sum",stub);

    Registry rgsty = LocateRegistry.createRegistry(8999);
    rgsty.rebind("rmi://localhost:8999/sum", stub);
    
}catch(Exception e){System.out.println(e);}
}

}
