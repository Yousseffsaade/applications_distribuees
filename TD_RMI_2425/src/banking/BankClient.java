package banking;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class BankClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            Bank bank = (Bank) registry.lookup("BankService");

            // Test des opérations bancaires
            String account = "123456";
            System.out.println("Solde initial : " + bank.getBalance(account));

            bank.deposit(account, 200);
            System.out.println("Après dépôt de 200€ : " + bank.getBalance(account));

            bank.withdraw(account, 150);
            System.out.println("Après retrait de 150€ : " + bank.getBalance(account));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
