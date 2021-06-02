package Enthuware._10StreamsLambda.Lambda.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age  = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        List<Person> friends = Arrays.asList(
            new Person("Bob", 31),
            new Person("Paul", 32)
        );
        double averageAge = friends.stream()
            .filter(p -> p.getAge() < 30) // stream with no elems
            .mapToInt(m -> m.getAge())
            .average() // returns an OptionalDouble, if stream contains no elems --> OptionalDouble.empty
            .orElse(0.0);
        System.out.println(averageAge);
        
        // ---

        List<StringBuilder> messages = Arrays.asList(
            new StringBuilder(), new StringBuilder()
        );
        messages.stream().forEach(s -> s.append("helloworld"));
        messages.stream().forEach(s -> {
            s.insert(5, ",");
            System.out.println(s);
        });
    }
}
