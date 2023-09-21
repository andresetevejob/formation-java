package org.example.conteneur;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookConteneur {
    public static void main(String[] args){
        char reponse = 'O';
        List<Book> books = new ArrayList<>();

        int id = 1;
        do{
            Scanner scanner = new Scanner(System.in);
            Scanner responseSaisie = new Scanner(System.in);
            System.out.print( "Veuillez saisir le nom d'un livre : " );
            String title = scanner.nextLine();
            Book b = new Book();
            b.setId(id);
            b.setTitle(title);
            books.add(b);
            System.out.print( "Voulez vous continuez O(Oui), N(Non) " );
            reponse = responseSaisie.nextLine().charAt(0);
            System.out.println(reponse);
            id++;
        }while(reponse=='O');
        for(Book b: books){
            System.out.println(b.getId());
            System.out.println(b.getTitle());
        }
    }
}
