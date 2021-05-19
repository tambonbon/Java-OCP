package Enthuware._10StreamsLambda.FI;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleSupplier;
import java.util.stream.Stream;

public class Book {
    private String title;
    private Double price;

    public Book(String title, Double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public static void main(String[] args) {
        // Book b1 = new Book("Java in 24hrs", (double) 24);
        // DoubleSupplier b = b1::getPrice;
        // b.getAsDouble();
        // Double a = b1.getPrice();

        // System.out.println(b);
        // System.out.println(a);

        var books = List.of(new Book("The Outsider", 2.99), new Book("Where is it", 4.99),
                        new Book("Coffin from Hong Kong", 1.99));
        double total = books.stream().map(book->book.getPrice()).reduce(
            0.0, (a,b) -> { return a + b;});
        
        // equivalent to above stream
        DoubleBinaryOperator doubleBinaryOperator = (a,b) -> a+b;
        double total2 = books.stream().mapToDouble(book -> book.getPrice()).reduce(0.0, doubleBinaryOperator);
        System.out.println(total==total2); // mapToDouble returns DoubleStream instead of Stream<Double>

        BinaryOperator<Double> binaryOperator = (a,b) -> a+b;
        double total3 = books.stream().map(book -> book.getPrice()).reduce(0.0, binaryOperator);
        System.out.println(total2 == total3); // true

        // get average
        double average = books.stream().mapToDouble(Book::getPrice).average().getAsDouble();
        System.out.println(average);

    }
    
}
