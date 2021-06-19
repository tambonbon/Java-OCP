package Enthuware._04CollectionAPI;

import java.util.Collections;
import java.util.List;

public class SortListBook {

    static class Book  {
        String isbn;
        String title;
        public Book(String isbn, String title) {
            this.isbn = isbn;
            this.title = title;
        }

        public int compareTo(Book b) {
            return this.isbn.compareTo(b.isbn);
        }            
        public String getIsbn() {
            return isbn;
        }
        public String getTitle() {
            return title;
        }
    }

    public static void main(String[] args) {
        List<Book> books = List.of(new Book("90823", "Java"));

        // valid sort
        Collections.sort(books, (b1, b2) -> b1.getTitle().compareTo(b2.getTitle()));
        
        // invalid sort
        Collections.sort(books); // invalid, Book class MUST implement Comparable

        books.stream().sorted().forEach(System.out::println); // runtime error
    }
}
