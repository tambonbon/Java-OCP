package Chapter14.wrapperClass;

import java.util.ArrayList;
import java.util.List;

public class TestWrapper {

    public static void main(String[] args) {
        Integer pounds = 120; // auto-boxing
        Character letter = "robot".charAt(2); // auto-boxing
        char r = letter;      // un-boxing
        System.out.println(r); //b

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(Integer.valueOf(3));
        numbers.add(Integer.valueOf(5));
        numbers.remove(1);
        System.out.println(numbers);
    }
}
