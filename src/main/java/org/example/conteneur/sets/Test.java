package org.example.conteneur.sets;

import org.example.conteneur.Book;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args){
        Set<String> words = new HashSet<>();
        words.add("Le bonheur");
        words.add("Le bonheur");
        words.add("c'est merveilleux");
        for(String word: words){
            System.out.println(word);
        }

        Set<Book> bibliottheques = new HashSet<>();
        Book b = new Book();
        b.setId(1);
        b.setTitle("Bob l'éponge");

        Book b2 = new Book();
        b2.setId(1);
        b2.setTitle("La tulipe noire");

        if(bibliottheques.add(b)){
            System.out.println("Le livre "+b.getTitle()+" a été ajouté");
        }
        if(bibliottheques.add(b2)){
            System.out.println("Le livre "+b2.getTitle()+" a été ajouté");
        }
        bibliottheques.add(null);
        System.out.println(bibliottheques.size());
    }
}
