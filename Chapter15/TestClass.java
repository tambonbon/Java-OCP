import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class TestClass {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1,2,3);
        ls.stream()
            .forEach(x -> {
                new MyProcessor(x).process();
            });
            // .map(MyProcessor::new)
            // .forEach(MyProcessor::process);
        List<String> strlist =  Arrays.asList("a", "aa");
        Function<String, Integer> f = x -> x.length();
        Consumer<String> c = x -> System.out.println("Len:"+x);
        Predicate<String> p = x -> "".equals(x);
        // strlist.for
        strlist.forEach(c);
    }
}

class MyProcessor {
    Integer value;
    public MyProcessor(Integer value) {
        this.value = value;
    }
    public void process() {
        System.out.println(value+ " ");
    }
}