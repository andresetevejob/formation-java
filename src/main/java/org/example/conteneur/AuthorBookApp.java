package org.example.conteneur;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AuthorBookApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Author> authors = new ArrayList<>();

        char response;

        do {
            System.out.print("Veuillez saisir le nom de l'auteur : ");
            String authorName = scanner.nextLine();
            Author author = new Author(authorName);

            char bookResponse;
            do {
                System.out.print("Veuillez saisir le titre d'un livre : ");
                String bookTitle = scanner.nextLine();
                author.addBook(bookTitle);

                System.out.print("Voulez-vous ajouter un autre livre pour cet auteur (O/N) ? ");
                bookResponse = scanner.nextLine().charAt(0);
            } while (bookResponse == 'O');

            authors.add(author);

            System.out.print("Voulez-vous enregistrer un autre auteur (O/N) ? ");
            response = scanner.nextLine().charAt(0);
        } while (response == 'O');

        // Affichage des auteurs et de leurs livres
        System.out.println("Les Auteurs enregistrés et leurs livres :");
        for (Author author : authors) {
            System.out.println("Auteur : " + author.getName());
            List<String> books = author.getBooks();
            for (String book : books) {
                System.out.println("- " + book);
            }
            System.out.println();
        }
    }
}
