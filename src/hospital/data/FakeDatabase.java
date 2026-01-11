package hospital.data;

import hospital.auth.*; // permet d'importer toutes les classes du package auth
import hospital.users.*; // permet d'importer toutes les classes du package users

import java.util.*;

/**
 * Base de données simulée
 */
public class FakeDatabase {

    public static List<CompteUtilisateur> comptes = new ArrayList<>();

    static {
        // Parent
        Parents parent = new Parents(
                "Kazamba", "Jean", "RDC", "Kinshasa", new Date()
        );
        comptes.add(new CompteUtilisateur(
                new Login("parent", "1234"), parent
        )); // ici on ajoute un compte utilisateur pour le parent et ainsi de suite pour les reste de user

        // Personnel hospitalier
        PersonnelHospitalier hopital =
                new PersonnelHospitalier("Ilunga", "Marie", "RDC", "Kin");
        comptes.add(new CompteUtilisateur(
                new Login("hopital", "1234"), hopital
        ));

        // Bureau état civil
        BureauEtatCivil etatCivil =
                new BureauEtatCivil("Mukendi", "Paul", "RDC",
                        "Kin", "Gombe", "Kinshasa");
        comptes.add(new CompteUtilisateur(
                new Login("etat", "1234"), etatCivil
        ));

        // Caisse allocation
        EmployeCaisseAllocation caisse =
                new EmployeCaisseAllocation("Tshibola", "Anne",
                        "RDC", "Kin", "Limete", "Kinshasa");
        comptes.add(new CompteUtilisateur(
                new Login("caisse", "1234"), caisse
        ));
    }
}