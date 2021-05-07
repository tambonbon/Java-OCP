package Chapter18;

import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Collectors;

public class SkipList {
    public static void main(String[] args) {
        Set<String> gardenAnimals = new ConcurrentSkipListSet<>();
        gardenAnimals.add("rabbit");
        gardenAnimals.add("gopher");
        System.out.println(gardenAnimals.stream().collect(Collectors.joining(","))); 

        Set<String> gardenAnimals1 = new TreeSet<>();
        gardenAnimals1.add("rabbit");
        gardenAnimals1.add("gopher");
        System.out.println(gardenAnimals1.stream().collect(Collectors.joining(","))); 

        Set<String> gardenAnimals2 = new ConcurrentSkipListSet<>();
        gardenAnimals2.add("rabbit");
        gardenAnimals2.add("gopher");
        System.out.println(gardenAnimals2.parallelStream().collect(Collectors.joining(","))); 
    }
}