package hospital.data;

import hospital.auth.*;
import hospital.users.*;

import java.util.*;

/**
 * Base de données simulée (en mémoire)
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
        ));

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