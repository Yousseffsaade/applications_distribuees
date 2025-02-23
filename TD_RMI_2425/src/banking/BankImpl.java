package banking;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

public class BankImpl extends UnicastRemoteObject implements Bank {
    private final Map<String, Double> accounts;

    protected BankImpl() throws RemoteException {
        super();
        accounts = new HashMap<>();
        accounts.put("123456", 1000.0); // Compte avec 1000€
        accounts.put("654321", 500.0);  // Compte avec 500€
    }

    @Override
    public double getBalance(String accountNumber) throws RemoteException {
        return accounts.getOrDefault(accountNumber, 0.0);
    }

    @Override
    public void deposit(String accountNumber, double amount) throws RemoteException {
        accounts.put(accountNumber, accounts.getOrDefault(accountNumber, 0.0) + amount);
    }

    @Override
    public void withdraw(String accountNumber, double amount) throws RemoteException {
        double balance = accounts.getOrDefault(accountNumber, 0.0);
        if (balance >= amount) {
            accounts.put(accountNumber, balance - amount);
        } else {
            throw new RemoteException("Fonds insuffisants !");
        }
    }
}
