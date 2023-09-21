package org.example.conteneur;

import java.util.ArrayList;
import java.util.List;

public class BookConteneur {
    public static void main(String[] args){
        Book book = new Book();
        book.setId(1);
        book.setTitle("Elle est belle la ville de Paris");

        Book book2 = new Book();
        book2.setId(2);
        book2.setTitle("La tour eiffel oeuvre d'art");

        List<Book> books = new ArrayList<>();
        books.add(book);
        books.add(book2);
        books.remove(book);

        System.out.println(books.size());
    }
}
