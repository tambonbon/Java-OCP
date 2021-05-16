package Enthuware._10StreamsLambda.Optional;

import java.util.Optional;
import java.util.function.Supplier;

public class FunWithOptional1 {
    public static void main(String[] args) {
        Optional<String> sOptional = Optional.of(null); // .of throws NPE if create an Optional with null
        // remarks: if you expect argument to be null..
        // .. --> use Optional.ofNullable, which returns empty Optional if argument is null

        Optional<Double> sOptional2 = Optional.ofNullable(null);
        sOptional2.isPresent();
        sOptional2.get(); // NoSuchElementException, no value present
        // remarks: if you expect an Optional to be empty ..
        // .. --> use orElse(T) method, which never throws any exception
        System.out.println( sOptional2.orElse(Math.random()));
        System.out.println(sOptional2.orElseGet(() -> Math.random()));
        System.err.println(sOptional2.orElseThrow()); // throw NoSuchElementException if no value presents
    }
}
