package org.example;

import org.example.models.Ecole;
import org.example.models.Etudiant;

public class University {
    public static void main(String[] args){
        Ecole ecole1 = new Ecole();
        ecole1.setNom("Simplon Co");
        ecole1.setSuperficie("320,26m²");
        ecole1.setNbrClasses(23);
        ecole1.setNbrProfesseurs(20);
        ecole1.setNumRue(12);
        ecole1.setNomRue("Rue Alphonse Daudet");
        ecole1.setCodePostal(33000);
        ecole1.setVille("Bordeaux");

        Etudiant etudiant1 = new Etudiant();
        etudiant1.setSexe("Garçon");
        etudiant1.setNom("Ben");
        etudiant1.setPrenom("Thomas");
        etudiant1.setAge(27);
        etudiant1.setTaille("1m82");
        etudiant1.setClasse("Terminale B");

        Etudiant etudiant2 = new Etudiant();
        etudiant2.setSexe("Fille");
        etudiant2.setNom("Rousseau");
        etudiant2.setPrenom("Louise");
        etudiant2.setAge(19);
        etudiant2.setTaille("1m82");
        etudiant2.setClasse("Terminale A");

        ecole1.addEtudiant(etudiant1);
        ecole1.addEtudiant(etudiant2);
        ecole1.showEtudiants();

        Ecole ecole2 = new Ecole();
        ecole2.setNom("Lycee Sacré Coeur");
        ecole2.setSuperficie("500,26m²");
        ecole2.setNbrClasses(50);
        ecole2.setNbrProfesseurs(100);
        ecole2.setNumRue(15);
        ecole2.setNomRue("Rue General de Gaulle");
        ecole2.setCodePostal(95000);
        ecole2.setVille("Paris");

        Etudiant etudiant3 = new Etudiant();
        etudiant3.setSexe("Garçon");
        etudiant3.setNom("Ben");
        etudiant3.setPrenom("Thomas");
        etudiant3.setAge(27);
        etudiant3.setTaille("1m82");
        etudiant3.setClasse("Terminale B");

        ecole2.addEtudiant(etudiant3);
    }
}
