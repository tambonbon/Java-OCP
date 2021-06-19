package Enthuware._02JavaOOP.nestedClasses;

public class CallStaticMethodInnerClass {
    public static class TestInner {
        public void sayIt() {
            System.out.println("hello");
        }
        protected static void sayItStatic() {
            System.out.println("helloStatic");
        }

        public static void main(String[] args) {
            new CallStaticMethodInnerClass.TestInner().sayItStatic();
            TestInner.sayItStatic();
            new TestInner().sayIt();

            // invalid codes
            TestInner.sayIt(); // CANT REFER TO nonstatic
            
        }

        void test() {
            // both are fine to call  static/nonstatic methods ..
            // .. because test is non-static method
            sayItStatic();
            sayIt();
        }

        static void testStatic() {
            sayItStatic();

            sayIt(); // invalid, as sayIt() is non-static but called in static
        }
    }
}
