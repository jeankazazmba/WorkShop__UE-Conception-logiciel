package hospital.users;

import java.util.InputMismatchException; // importation de la classe InputMismatchException pour gérer les erreurs de saisie
import java.util.Scanner; // importation de la classe Scanner qui permet de lire l'entrée utilisateur

public class PersonnelHospitalier extends User {

    public PersonnelHospitalier(String nom, String prenom,
                                String pays, String adresse) {
        super(nom, prenom, pays, adresse); // appel du constructeur de la classe parente User
        // ici le mot clef super fait référence à la classe parente User
    }

    public void menu() {
        System.out.println("1. Enregistrer une naissance");
    }

    public void enregistrerNaissance() {

        int choix;

        System.out.println("voulez-vous enregistrer la naissance ?");
        System.out.println("1. Oui");
        System.out.println("2. Non");

        // Lire l'entrée utilisateur depuis la console

        Scanner scanner = new Scanner(System.in);
        System.out.print("choix: ");
        try {
            choix = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Entrée invalide. Veuillez saisir un nombre (1 ou 2).");
            scanner.nextLine(); // consommer la mauvaise entrée
            return; // on quitte la méthode si l'entrée est invalide
        }

        if (choix == 1) {
            System.out.println("Naissance enregistrée avec succès.");
        } else {
            System.out.println("Enregistrement annulé.");
        }
    }
}

/*
Personnel hospitalier et cliniques :
Ils auront la capacité d'enregistrer les naissances,
ce qui déclenchera automatiquement la délivrance de certificats de naissance.
* */