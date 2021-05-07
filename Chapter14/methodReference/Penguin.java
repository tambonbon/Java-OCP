package Chapter14.methodReference;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Penguin {
  public static Integer countBabies(Penguin... cuties) {
    return cuties.length;
  }
  public static void main(String[] args) {
    // 3 ways that Penguin::countBabies can be interpreted
    Supplier<Integer> methodRef1 = Penguin::countBabies;
    Supplier<Integer> lambda1    = () -> Penguin.countBabies();

    Function<Penguin, Integer> methodRef2 = Penguin::countBabies;
    Function<Penguin, Integer> lambda2    = (x) -> Penguin.countBabies(x);

    BiFunction<Penguin, Penguin, Integer> methodRef3 = Penguin::countBabies;
    BiFunction<Penguin, Penguin, Integer> lambda3    = 
            (penguin1, penguin2) -> Penguin.countBabies(penguin1, penguin2);
  }
}
