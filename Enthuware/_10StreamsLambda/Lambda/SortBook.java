package Enthuware._10StreamsLambda.Lambda;

import java.util.Comparator;
import java.util.List;

public class SortBook {
    static class Book {
        private String title;
        private String genre;
        public Book(String title, String genre) {
            this.title = title;
            this.genre = genre;
        }
        public String getGenre() {
            return genre;
        }
        public String getTitle() {
            return title;
        }        
        @Override
        public String toString() {
            return title + " " + genre;
        }
    }

    public static void main(String[] args) {
        List<Book> books = List.of(new Book("Java", "Study"), new Book("OCP", "Study"));
        
        Comparator<Book> c1 = (b1, b2) -> b1.getGenre().compareTo(b2.getGenre());
        books.stream().sorted(c1.thenComparing(Book::getTitle));

        System.out.println(books);
    }
}
