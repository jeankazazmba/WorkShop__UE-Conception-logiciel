package hospital.users;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BureauEtatCivil extends User {

    Scanner scanner = new Scanner(System.in);

    private String arrondissement;
    private String ville;

    public BureauEtatCivil(String nom, String prenom, String pays,
                           String adresse, String arrondissement, String ville) {
        super(nom, prenom, pays, adresse);
        this.arrondissement = arrondissement;
        this.ville = ville;
    }

    public void menu() {
        System.out.println("===== Bureau de l'état civil =====");
        System.out.println("Veuillez choisir une option :");
        System.out.println("1.Créer un acte de naissance");
        System.out.println("2 ou Autre : Quitter");

        int choix;
        //scanner = new Scanner(System.in);

        System.out.print("choix: ");
        try {
            choix = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Entrée invalide. Veuillez saisir un nombre (1 ou 2).");
            scanner.nextLine(); // consommer la mauvaise entrée
            return; // on quitte la méthode si l'entrée est invalide
        }

        if (choix == 1) {
            creerActeNaissance();
        } else {
            System.out.println("FIN du Programme");
        }

    }

    public void creerActeNaissance() {
        System.out.println("📄 Acte de naissance créé.");
    }
}

/*
Ils pourront établir des actes de naissances sur la base de certificats
de naissance générés et des informations complémentaires que leur auront
fournies les parents.
* */