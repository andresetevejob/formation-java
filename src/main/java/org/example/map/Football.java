package org.example.map;

import org.example.conteneur.Book;

import java.util.*;

public class Football {
    public static void main(String[] args){
        // A faire
        // Ajouter un identifiant au joueur
        // Faire un recherche sur un joueur à partir de son identifiant (Repondre par un oui ou non)
        // Afficher la liste des joueurs de chacune des equipe
        char reponse = 'O';
        Map<String,List<Joueur>> equipes = new HashMap<String,List<Joueur>>();
        do{
            List<Joueur> joueurs = new ArrayList<>();
            Scanner equieSaisieNom = new Scanner(System.in);
            Scanner nomJoueurSaisie = new Scanner(System.in);
            Scanner responseSaisie = new Scanner(System.in);
            System.out.print( "Veuillez saisir le nom de votre equipe : " );
            String equipe = equieSaisieNom.nextLine();

            if(equipes.containsKey(equipe)){
                joueurs = equipes.get(equipe);
            }
            System.out.print( "Entrez votre nom " );
            String nomJoueur = nomJoueurSaisie.nextLine();
            Joueur joueur = new Joueur();
            joueur.setNom(nomJoueur);
            joueurs.add(joueur);
            equipes.put(equipe,joueurs);
            System.out.print( "Voulez vous continuer ? " );
            reponse = responseSaisie.nextLine().charAt(0);
            System.out.println(reponse);
        }while(reponse=='O');

    }
}
