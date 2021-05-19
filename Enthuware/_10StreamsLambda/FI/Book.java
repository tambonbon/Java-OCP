package Enthuware._10StreamsLambda.FI;

import java.util.function.DoubleSupplier;

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
        Book b1 = new Book("Java in 24hrs", (double) 24);
        DoubleSupplier b = b1::getPrice;
        b.getAsDouble();
        Double a = b1.getPrice();

        System.out.println(b);
        System.out.println(a);
    }
    
}
