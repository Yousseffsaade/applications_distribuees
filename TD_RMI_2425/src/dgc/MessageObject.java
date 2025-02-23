package dgc;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MessageObject extends Remote {
    String getMessage() throws RemoteException;
}
