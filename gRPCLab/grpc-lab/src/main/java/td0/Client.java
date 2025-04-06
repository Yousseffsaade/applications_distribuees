package td0;

import java.io.FileInputStream;
import java.io.IOException;

public class Client {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("td1.ser");
            MyUser user = MyUser.parseFrom(fis);
            fis.close();

            System.out.println("✅ Lecture depuis td1.ser réussie !");
            System.out.println("Email: " + user.getEmail());
            System.out.println("Année de naissance: " + user.getYearOfBirth());
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture : " + e.getMessage());
        }
    }
}
