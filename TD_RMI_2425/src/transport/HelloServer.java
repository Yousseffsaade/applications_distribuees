package transport;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class HelloServer {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry(1099);
            Hello hello = new HelloImpl();
            registry.rebind("HelloService", hello);
            System.out.println("✅ HelloService démarré avec succès !");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
