import java.rmi.*;
import java.rmi.server.*;

public class AdderRemote extends UnicastRemoteObject implements Adder{

AdderRemote()throws RemoteException{
super();
}

public int add(int x,int y)
{
    System.out.println("Client sent: ");
    System.out.println("x : " + x);
    System.out.println("y : " + y);
    
    return x+y;
}

}
