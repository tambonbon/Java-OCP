package Enthuware._10StreamsLambda.Lambda;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Map1 {
    public static void main(String[] args) {
        Map<String, String> books = new HashMap<>();
        books.put("978-21938", "Design patterns");
        books.put("978-12893", "Java in Action");
        books.put("978-98121", "Effective Java");

        Set<Entry<String, String>> entrySet = books.entrySet();
        System.out.println(entrySet); 

        /* 
        [978-21938=Design patterns, 978-12893=Java in Action, 978-98121=Effective Java]
         */
        
         // Retrieving a Match
        // Fiding the ISBN for the book title Effective Java

        Optional<String> optionalIsbn = books
                        .entrySet() // entrySet returns a Set<Map.Entry<String,String>> of key/value pair
                        .stream()
                        .filter(entry -> "Effective Java".equals(entry.getValue())) // filter the entries within the Set
                        .map(Map.Entry::getKey) // generate a new stream as output containing only the keys
                        .findFirst();
        
        System.out.println(optionalIsbn.get());

        books.put("978-03213", "Effective Java: Second Edition");
        
        // Find all books starting with Effective Java
        Set<String> isbnCodes = books
            .entrySet()
            .stream()
            .filter(entry -> entry.getValue().contains("Effective Java"))
            .map(Entry::getKey)
            .collect(Collectors.toSet());
        
        System.out.println(isbnCodes);

        List<String> titles = books 
            .entrySet() 
            /* 
            Maps can only be iterated in 3 ways: 
            1. A set of keys
            2. A collection of values
            3. A set of key-value pairs
            */ 
            .stream()
            .map(Entry::getValue)
            .collect(Collectors.toList());
        System.out.println(titles);

        List<String> titles2 = books
            .values()
            .stream()
            .collect(Collectors.toList());
        
        assertEquals(titles, titles2);

    }
}
