package org.example;

import org.example.models.Adresse;
import org.example.models.Personne;

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
    }
}
