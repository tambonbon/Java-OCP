package Enthuware._10StreamsLambda.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Book {
    private int id;
    private String title;
    private String genre;
    private String author;
    private double price;


    public Book( String title, String genre, String author) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.author = author;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return (title + genre + author);
    }
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
        new Book("There is a hippy on the highway", "Thriller", "James Hadley Chase"), 
       new Book("Coffin from Hongkong", "Thriller", "James Hadley Chase"),
       new Book("The Client", "Thriller", "John Grisham"),
       new Book("Gone with the wind", "Fiction", "Margaret Mitchell")
       );

       Map<String, Map<String, List<Book>>> classified= books.stream()
                        .collect(
                            Collectors.groupingBy(
                                Book::getGenre,
                                Collectors.groupingBy(Book::getAuthor)
                            )
                        );
        System.out.println(classified);

        List<String> classified2= books.stream()
        .collect(
            Collectors.mapping(
                Book::getAuthor,
                Collectors.toList()
            )
        );
        System.out.println(classified2);
    }
    
    
}
