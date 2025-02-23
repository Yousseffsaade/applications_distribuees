package dgc;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MessageObjectImpl extends UnicastRemoteObject implements MessageObject {
    private final String message;

    protected MessageObjectImpl(String msg) throws RemoteException {
        super();
        this.message = msg;
    }

    @Override
    public String getMessage() throws RemoteException {
        return message;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("⚠️ MessageObject (" + message + ") est en train d'être garbage collecté !");
        super.finalize();
    }
}
