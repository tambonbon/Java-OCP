package Enthuware._02JavaOOA.nestedClasses;

public class Test6 {
    public static class TestInner {
        public void sayIt() {
            System.out.println("hello");
        }
        protected static void sayItStatic() {
            System.out.println("helloStatic");
        }

        public static void main(String[] args) {
            new Test6.TestInner().sayItStatic();
            TestInner.sayItStatic();
            TestInner.sayIt(); // CANT REFER TO nonstatic
            
        }
    }
}
