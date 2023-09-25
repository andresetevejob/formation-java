package org.example.sitebadoo;

import org.example.conteneur.Book;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        char reponse = 'O';
        do{
            Scanner nomSaisie = new Scanner(System.in);
            Scanner responseSaisie = new Scanner(System.in);
            System.out.print( "Entrez votre nom : " );
            String nom = nomSaisie.nextLine();
            Scanner prenomsSaisie = new Scanner(System.in);
            System.out.print( "Entrez votre prenom : " );
            String prenoms = prenomsSaisie.nextLine();
            Scanner ageSaisie = new Scanner(System.in);
            System.out.print( "Entrez votre age : " );
            int age = ageSaisie.nextInt();
            if(age<18){
                throw new UtilisateurTropJeuneException("Vous n'avez pas l'age requis");
            }
            System.out.print( "Voulez vous continuez O(Oui), N(Non) " );
            reponse = responseSaisie.nextLine().charAt(0);
            System.out.println(reponse);
        }while(reponse=='O');
    }
}
