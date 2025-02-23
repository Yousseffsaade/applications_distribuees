package banking;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class BankServer {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry(1099);
            Bank bank = new BankImpl();
            registry.rebind("BankService", bank);
            System.out.println("✅ BankService démarré avec succès !");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
