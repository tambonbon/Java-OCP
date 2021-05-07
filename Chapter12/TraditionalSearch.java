import java.util.*;
import java.util.function.Predicate;

public class TraditionalSearch {
        public static void main(String[] args) {
            //list of animals
            //
            var animals = new ArrayList<Animal>();
            animals.add(new Animal("fish", false, true));
            animals.add(new Animal("kangaroo", true, true));

            // pass lambda that does check
            print(animals, a -> a.canSwim());
        }
        private static void print(List<Animal> animals, Predicate<Animal> checker) {
                for (Animal animal : animals) {
                        if (checker.test(animal)) System.out.print(animal + " ");
                }
        }
}
