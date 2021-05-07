package Enthuware._02JavaOOA.fieldsMethods;

class Wrapper {
    int w = 10; // other instance from other class can call this
}

public class Test4 {
     static Wrapper changWrapper(Wrapper w) {
        w = new Wrapper();
        w.w += 9;
        return w;
    }    
    public static void main(String[] args) {
        var w = new Wrapper();
        w.w = 20;
        Wrapper w1 = changWrapper(w);
        System.out.println(w1.w); //19
        System.out.println(w.w); // 20

        w.w += 30;
        
        System.out.println(w.w); // 50
        w = changWrapper(w);
        System.out.println(w.w); // 19
    }
}
