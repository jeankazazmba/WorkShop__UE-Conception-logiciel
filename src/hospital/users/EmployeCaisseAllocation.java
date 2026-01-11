package hospital.users;

public class EmployeCaisseAllocation extends User {

    private String arrondissement;
    private String ville;

    public EmployeCaisseAllocation(String nom, String prenom,
                                   String pays, String adresse,
                                   String arrondissement, String ville) {
        super(nom, prenom, pays, adresse);
        this.arrondissement = arrondissement;
        this.ville = ville;
    }

    public void menu() {
        System.out.println("1. Valider une allocation");
    }

    public void validerAllocation() {
        System.out.println("✅ Allocation validée.");
    }
}