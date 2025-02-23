package calculator;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculatorServer {
    public static void main(String[] args) {
        try {
            // Créer un registre RMI (utilise 1099 par défaut)
            Registry registry = LocateRegistry.getRegistry(1099);

            // Créer une instance de l'implémentation
            Calculator calculator = new CalculatorImpl();

            // Enregistrer l'objet avec un nom
            registry.rebind("CalculatorService", calculator);

            System.out.println("✅ CalculatorService démarré avec succès !");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
