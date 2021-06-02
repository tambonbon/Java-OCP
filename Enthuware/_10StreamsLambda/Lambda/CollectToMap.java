package Enthuware._10StreamsLambda.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectToMap {
    static class Book {
        private String title;
        private double price;

        Book(String title, double price) {
            this.title = title;
            this.price = price;
        }

        public double getPrice() {
            return price;
        }

        public String getTitle() {
            return title;
        }

    }
   
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
            new Book("Gone with the wind", 5.0),
            new Book("Gone with the wind", 10.0),
            new Book("Atlas Shrugged", 15.0)
        ); // Note that books have duplicate title

        Map<String, Double> map2 = books
            .stream()
            .collect(Collectors.toMap(b -> b.getTitle(), b -> b.getPrice(), 
                (v1,v2) -> v1+v2)); // this UnaryOperator is for dealing with duplicate titles
        
        map2.forEach((k,v) -> System.out.println(k + v ));

        /* Invalid codes
         */
        Map<String, Double> map1 = books
            .stream()
            .collect(Collectors.toMap((b -> b.getTitle()), b -> b.getPrice()));

        map1.forEach((k,v) -> System.out.println(k));
        
    }   
}
