package Enthuware._10StreamsLambda.FI;

import java.util.function.Function;

public class FinalVariablesLambda {
    public double process(double payment, int rate) {
        // A local variables needs to be FINAL or EFFECTIVELY FINAL
        // in order to be used in lambdas, or inner class
        double defaultRate = 0.10;
        if (rate > 10) defaultRate = rate;
        
        class Implement {
            public int apply(double data) {
                // Function<Integer, Integer> f = x -> x + (int) (x*defaultRate);
                Function<Integer, Integer> f = x -> x + (int)(x*rate);
                return f.apply((int) data);
            }
        }
        Implement i = new Implement();
        return i.apply(payment);
    }
}
