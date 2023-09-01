package org.example;

<<<<<<< HEAD
import org.example.models.*;
=======
import org.example.models.Adresse;
import org.example.models.Data;
import org.example.models.Personne;
>>>>>>> ff63493 (save new Data class)

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Personne personne1  = new Personne();
        personne1.setNom("Thomas");
        personne1.setPrenoms("Dubois Laurent");
        personne1.setAge(27);
        personne1.setTaille("1m80");
        personne1.parler();
        Adresse adresse1 = new Adresse();
        adresse1.setNoRue("76 rue de moscou");
        adresse1.setComplement("BAT E Appt 403");
        adresse1.setCodePostal("57800");
        adresse1.setVille("VilleJuif");
        personne1.setAdresse(adresse1);

<<<<<<< HEAD
        Moteur moteur1 = new Moteur();
        moteur1.setType("Essence");
        moteur1.setNbrChevaux(80);

        Voiture voiture1 = new Voiture();
        voiture1.setModele("Clio4");
        voiture1.setCouleur("Gris");
        voiture1.setMoteur(moteur1);
        voiture1.demarrer();

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
        etudiant1.setEcole(ecole1);
        etudiant1.sepresenter();
=======
        Data data = new Data();
        data.callAbout();
>>>>>>> ff63493 (save new Data class)
    }


}
