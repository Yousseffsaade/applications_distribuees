package calculator;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculatorClient {
    public static void main(String[] args) {
        try {
            // Se connecter au registre RMI sur localhost (port 1099)
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            // Chercher le service distant par son nom
            Calculator calculator = (Calculator) registry.lookup("CalculatorService");

            // Exécuter les opérations
            System.out.println("Addition (5 + 3): " + calculator.add(5, 3));
            System.out.println("Multiplication (4 * 6): " + calculator.multiply(4, 6));
            System.out.println("Soustraction (10 - 2): " + calculator.subtract(10, 2));
            System.out.println("Division (8 / 2): " + calculator.divide(8, 2));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
