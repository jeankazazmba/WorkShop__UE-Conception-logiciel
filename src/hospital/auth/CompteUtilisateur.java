package hospital.auth;

import hospital.users.User;
import java.util.Date;

/**
 * CompteUtilisateur
 * Composition avec Login -> un CompteUtilisateur ne peut pas exister sans Login
 * Association 1–1 avec User -> un CompteUtilisateur est lié à un seul User
 */
public class CompteUtilisateur {

    private Date dateDeCreation;
    private String photoDeProfil;

    // autres attributs...

    private Login login;     // composition
    private User user;       // association 1–1

    public CompteUtilisateur(Login login, User user) {
        this.login = login;
        this.user = user;
        this.dateDeCreation = new Date();
    }

    public User getUser() {
        return user;
    }

    public Login getLogin() {
        return login;
    }
}