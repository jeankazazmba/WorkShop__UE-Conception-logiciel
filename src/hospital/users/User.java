package hospital.users;

/**
 * Classe abstraite User
 * une classe abstraite -> Une classe abstraite en Java est
 *      un modèle incomplet qui ne peut pas être instancié
 *      directement, mais sert de base pour d'autres classes (sous-classes)
 *      via l'héritage, et peut contenir des méthodes concrètes (avec implémentation)
 *      et des méthodes abstraites (sans corps) qui doivent être obligatoirement
 *      implémentées par les sous-classes non abstraites
 * Superclasse de tous les acteurs du système
 */
public abstract class User {

    public String nom;
    public String prenom;
    protected String pays;
    protected String adresse;

    public User(String nom, String prenom, String pays, String adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.pays = pays;
        this.adresse = adresse;
    }

    public void afficherInfos() {
        System.out.println(prenom + " " + nom + " - " + pays);
    }
}