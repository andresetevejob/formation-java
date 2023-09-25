package org.example.conteneur;

import java.util.ArrayList;
import java.util.List;

public class Author {

    private String name;
    private List<String> books;

    public Author(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addBook(String bookTitle) {
        books.add(bookTitle);
    }

    public List<String> getBooks() {
        return books;
    }
}
