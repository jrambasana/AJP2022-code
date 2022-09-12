import java.rmi.*;

public class MyClient{

public static void main(String args[]){
try{
    System.setProperty("java.rmi.server.hostname","127.0.0.1");
    Adder stub=(Adder)Naming.lookup("rmi://localhost:8999/sum");
    System.out.println(stub.add(34,4));
}catch(Exception e){System.out.println(e);}
}

}
