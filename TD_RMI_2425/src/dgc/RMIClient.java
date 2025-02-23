package dgc;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            MessageObject message1 = (MessageObject) registry.lookup("Message1");
            MessageObject message2 = (MessageObject) registry.lookup("Message2");

            System.out.println("Client a reçu : " + message1.getMessage());
            System.out.println("Client a reçu : " + message2.getMessage());

            // On laisse les références se perdre pour activer le GC
            message1 = null;
            message2 = null;

            System.gc(); // Demande un Garbage Collection

            Thread.sleep(5000); // Attend pour observer le GC
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
