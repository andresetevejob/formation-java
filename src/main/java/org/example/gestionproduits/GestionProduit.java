package org.example.gestionproduits;

import java.util.Scanner;

public class GestionProduit {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner( System.in ) ) {
            System.out.print( "Veuillez saisir nom pour le produit : " );
            String nom = scanner.nextLine();
            System.out.print( "Veuillez saisir une description pour le produit : " );
            String description = scanner.nextLine();
            Produit produit = new Produit();
            produit.setNom(nom);
            produit.setDescription(description);
            produit.descritToi();
        }
    }
}
