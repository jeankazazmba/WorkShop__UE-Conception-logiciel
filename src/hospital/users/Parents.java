package hospital.users;

import java.util.Date;
import  java.util.Scanner;

public class Parents extends User {

    private Date dateDeNaissance;
    Scanner scanner = new Scanner(System.in);

    public Parents(String nom, String prenom, String pays,
                   String adresse, Date dateDeNaissance) {
        super(nom, prenom, pays, adresse);
        this.dateDeNaissance = dateDeNaissance;
    }

    public void menu() {
        System.out.println("1. Consulter mes informations");
        System.out.println("2. Demander une allocation");
    }

    public void demanderAllocation() {
        System.out.println("📨 Demande d’allocation envoyée.");
    }
}