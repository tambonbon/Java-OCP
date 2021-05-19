package Enthuware._04CollectionAPI;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Book implements Comparable<Book>{ // if NO implements Comparable<Book> ---> NOT COMPILE 
    String isbn;
    String title;

    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public int compareTo(Book b) {
        return this.isbn.compareTo(b.isbn);
    }
    public String getTitle() {
        return title;
    }
    public String getIsbn() {
        return isbn;
    }

    public static void main(String[] args) {
        List<Book> books = new ArrayList<Book>(); // if here is List<Object> ---> ClassCastException (RTE)
        books.addAll(List.of(
            new Book("2130", "Niels"),
            new Book("0982", "Tammy"),
            new Book("9081", "Daniel")
        ));

        Collections.sort(books);
    }
}

