package hospital;

import hospital.auth.UserConnectionManager;
import hospital.users.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== SYSTÈME HOSPITALIER =====");
        System.out.print("Login : ");
        String login = scanner.nextLine();

        System.out.print("Mot de passe : ");
        String password = scanner.nextLine();

        User user = UserConnectionManager.login(login, password);

        if (user == null) return;

        System.out.println("\nBienvenue " + user.prenom + " " + user.nom);

        // Menu selon le rôle
        if (user instanceof Parents p) {
            p.menu();
            int choix = scanner.nextInt();
            if (choix == 2) p.demanderAllocation();
        }

        else if (user instanceof PersonnelHospitalier h) {
            h.menu();
            h.enregistrerNaissance();
        }

        else if (user instanceof BureauEtatCivil b) {
            b.menu();
            b.creerActeNaissance();
        }

        else if (user instanceof EmployeCaisseAllocation e) {
            e.menu();
            e.validerAllocation();
        }

        System.out.println("\n🔒 Fin de session.");
    }
}