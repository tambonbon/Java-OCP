package Enthuware._02JavaOOA.overriden;

class Bird {
    private Bird() { } // .. need to change to public
}

public class PrivConstr1 {
    static class Eagle extends Bird {
        public String name;
        public Eagle(String name) {
            // super() is automatically added
            this.name = name;
            // Implicit super constructor is not visible due to private
        }

        public static void main(String[] args) {
            System.out.println(new Eagle("Bald Eagle").name);
        }
    }
}
