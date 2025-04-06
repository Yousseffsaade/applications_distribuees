package td0;

import java.io.FileOutputStream;
import java.io.IOException;

public class Server {
    public static void main(String[] args) {
        MyUser user = MyUser.newBuilder()
                .setEmail("test@example.com")
                .setYearOfBirth(2000)
                .build();

        try {
            FileOutputStream fos = new FileOutputStream("td1.ser");
            user.writeTo(fos);
            fos.close();
            System.out.println("✅ Fichier td1.ser généré !");
        } catch (IOException e) {
            System.err.println("Erreur lors de la sérialisation : " + e.getMessage());
        }
    }
}
