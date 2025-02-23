package banking;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Bank extends Remote {
    double getBalance(String accountNumber) throws RemoteException;
    void deposit(String accountNumber, double amount) throws RemoteException;
    void withdraw(String accountNumber, double amount) throws RemoteException;
}
