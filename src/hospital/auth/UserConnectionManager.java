package hospital.auth;

import hospital.data.FakeDatabase;
import hospital.users.User;

/**
 * Gestion de l'authentification
 */
public class UserConnectionManager {

    public static User login(String id, String password) {

        for (CompteUtilisateur compte : FakeDatabase.comptes) {
            if (compte.getLogin().authenticate(id, password)) {
                System.out.println("✅ Connexion réussie !");
                return compte.getUser();
            }
        }

        System.out.println("❌ Identifiants incorrects.");
        return null;
    }
}