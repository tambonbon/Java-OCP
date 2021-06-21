package Enthuware._10StreamsLambda.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GetAverage {
    public static void main(String[] args) {
        // IntStream NOT have collect method
        var nums = IntStream.range(1, 5);
        var nums2 = IntStream.range(1, 5);
        var nums3 = IntStream.range(1, 5);

        // make average
        double average1 = nums.mapToObj(x -> x).collect( // mapToObj returns Stream
            Collectors.averagingDouble(element -> element)
        );
        System.out.println(average1);

        double average2 = nums2.average().getAsDouble();
        System.out.println(average2);

        double average3 = nums3.mapToDouble(x -> x).average().getAsDouble();
        System.out.println(average3);
        
    }

    // another example: 
    static class Item {
        private String name;
        private String category;
        private double price;

        public Item(String name, String category, double price) {
            this.name = name;
            this.category= category;
            this.price = price;
        }

        public String getCategory() {
            return category;
        }
        public double getPrice() {
            return price;
        }
    }

    static class Items {
        public static void main(String[] args) {
            List<Item> items = Arrays.asList(
                new Item("Pen", "Stationary", 3.0),
                new Item("Pencil", "Stationary", 1.0),
                new Item("Milk", "Food", 10.0),
                new Item("Eggs", "Food", 8.0)
            );

            ToDoubleFunction<Item> priceFunction = Item::getPrice;

            items.stream()
                .collect(Collectors.groupingBy(Item::getCategory)) // create a Map
                .forEach((k, v) -> {
                    double ave = v.stream().collect(Collectors.averagingDouble(priceFunction));
                    // averagingDouble takes ToDoubleFunction !!!!!
                    System.out.println(k + " : " +ave);
                    /* 
                    Stationary : 2.0
                    Food : 9.0 
                    */
                });
        }
    }
}
