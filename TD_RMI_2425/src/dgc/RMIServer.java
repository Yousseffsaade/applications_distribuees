package dgc;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServer {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry(1099);

            MessageObject message1 = new MessageObjectImpl("Hello, Client 1!");
            MessageObject message2 = new MessageObjectImpl("Hello, Client 2!");

            registry.rebind("Message1", message1);
            registry.rebind("Message2", message2);

            System.out.println("✅ RMIServer démarré avec succès !");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
