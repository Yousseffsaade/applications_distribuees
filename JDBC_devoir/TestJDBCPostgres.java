import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestJDBCPostgres {
    public static void main(String[] args) {
        // Informations de connexion
        String url = "jdbc:postgresql://localhost:5432/postgres"; // Correspond à votre base de données
        String user = "postgres"; // Vérifiez si c'est bien votre utilisateur PostgreSQL
        String password = "@4kHD"; // Remplacez par votre mot de passe PostgreSQL

        try {
            // Chargement du driver PostgreSQL
            Class.forName("org.postgresql.Driver");

            // Connexion à la base de données
            Connection cx = DriverManager.getConnection(url, user, password);

            // Exécution de la requête SQL
            Statement st = cx.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM personnes");

            // Affichage des résultats
            while (rs.next()) {
                String nom = rs.getString("nom");
                int age = rs.getInt("age");
                System.out.println(nom + " a " + age + " ans");
            }

            // Fermeture des ressources
            rs.close();
            st.close();
            cx.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
