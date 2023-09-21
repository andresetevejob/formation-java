package org.example.authentication;

import org.example.gestionproduits.Produit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreateAdmin {

    public static void main(String[] args){
        try (Scanner scanner = new Scanner( System.in ) ) {

            // Création de mon objet Admin

            System.out.print( "Veuillez saisir le nom de l'utilisateur : " );
            String nom = scanner.nextLine();
            System.out.print( "Veuillez saisir le prenom : " );
            String prenom = scanner.nextLine();
            Admin admin1 = new Admin();
            admin1.setId("2");
            admin1.setNom(nom);
            admin1.setPrenom(prenom);
            admin1.setLogin("identifiant");
            admin1.setPwd("Un mot de passe");


            // Création des privilèges de l'admin
            System.out.print( "Veuillez saisir le privilege n°1 de " + admin1.getNom() +" : " );
            String nomPrivilege1 = scanner.nextLine();
            System.out.print( "Veuillez saisir le privilege n°2 de l'admin " + admin1.getNom() +" : " );
            String nomPrivilege2 = scanner.nextLine();
            Privilege privilege1 = new Privilege();
            privilege1.setNom(nomPrivilege1);
            Privilege privilege2 = new Privilege();
            privilege2.setNom(nomPrivilege2);


            // Création de la liste des privilèges et ajout des privilèges
            List<Privilege> privileges = new ArrayList<>();
            privileges.add(privilege1);
            privileges.add(privilege2);

            //Je donne la liste des privileges à l'admin
            admin1.setPrivileges(privileges);

            admin1.presenteToi();
        }
    }
}
