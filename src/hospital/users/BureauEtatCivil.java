package hospital.users;

public class BureauEtatCivil extends User {

    private String arrondissement;
    private String ville;

    public BureauEtatCivil(String nom, String prenom, String pays,
                           String adresse, String arrondissement, String ville) {
        super(nom, prenom, pays, adresse);
        this.arrondissement = arrondissement;
        this.ville = ville;
    }

    public void menu() {
        System.out.println("1. Créer un acte de naissance");
    }

    public void creerActeNaissance() {
        System.out.println("📄 Acte de naissance créé.");
    }
}