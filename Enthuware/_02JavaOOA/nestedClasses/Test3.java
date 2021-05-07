package Enthuware._02JavaOOA.nestedClasses;

public class Test3 {
    int i = 10;
    class Inner {
        public void methodA() {
            System.out.println(i);
            System.out.println(Test3.this.i);
            // System.out.println( this.i); // WRONG
        }
    }
}
