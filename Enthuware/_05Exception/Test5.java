package Enthuware._05Exception;

public class Test5 {
    public static void doStuff() throws Exception {
        System.out.println("Doing stuff..");
        if (Math.random() > 0.4) {
            throw new Exception("too high");
        }
        System.out.println("Done stuff");
        // If the method throws exception midway...
        // ---> the rest of the method NEVER GET CALLED
    }
    public static void main(String[] args) throws Exception {
        doStuff();
        System.out.println("Over");
        
    }
}
