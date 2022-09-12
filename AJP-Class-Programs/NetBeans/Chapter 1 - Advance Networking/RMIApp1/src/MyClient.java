import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyClient{

public static void main(String args[]){
try{
    System.setProperty("java.rmi.server.hostname","127.0.0.1");
    Registry rgsty = LocateRegistry.getRegistry(8999);
    Adder stub = (Adder)rgsty.lookup("rmi://localhost:8999/sum");
//    Adder stub=(Adder)Naming.lookup("rmi://localhost:8999/sum");
    System.out.println( stub.add(5,6) );
}catch(Exception e){System.out.println(e);}
}

}
