package hospital.auth;

/**
 * Classe Login
 * Représente les informations d’authentification
 */
public class Login {

    private String id;
    private String password;

    public Login(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public boolean authenticate(String id, String password) {
        return this.id.equals(id) && this.password.equals(password);
    }
}