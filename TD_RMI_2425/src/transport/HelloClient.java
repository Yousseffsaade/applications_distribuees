package transport;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class HelloClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            Hello hello = (Hello) registry.lookup("HelloService");

            String response = hello.sayHello("Joe");
            System.out.println("Réponse du serveur : " + response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
