package org.example.conteneur;

import java.util.Scanner;
public class CreateBook {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner( System.in ) ) {


            System.out.print("Veuillez saisir le titre du livre : ");
            String title = scanner.nextLine();

            Book book = new Book();
            book.setTitle(title);

            Book book2 = new Book();
            book2.setTitle(title);
        }
    }
}
