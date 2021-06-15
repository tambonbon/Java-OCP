package Enthuware._02JavaOOP.overriding;
// 1250
class B { }
class B1 extends B { }
class B2 extends B { }

public class RunTimeError1 {
    public static void main(String[] args) {
        B b = new B();
        B1 b1 = new B1();
        B2 b2 = new B2();
        
        /**
         * Run time error
         */
        b1 = (B1) b;
        // As the actual object referenced by b is-not-a B1
        // .. by casting b to (B1), we are telling compiler that the object referred to by b...
        // .. will be of class B1 at RunTime.
        // Compiler accepts because it's possible for b to refer to refer to an object of class B1..
        // .. because B1 is-a B.
        // HOWEVER !!!!!
        // at RT, b is pointing to an object of class B..
        // .. as B is NOT b1 ---> ClassCastException

        b2 = (B2) b; // same

        /**
         * Compile time error
         *  */
        b2 = (B2) b1; // cannot cast from B1 to B2
        // b1 can never point to an object of class B2 (they are unrelated)
        // perhaps b2 = (B2) b

        b1 = (B) b1; 
        // By casting b1 to B, we're telling b1 points to object of class B
        // But you're then assigining this reference to b1, which is of class B1
        // ----> no guarantee that the reference will actually point to object of class B1
        // ----> solution: b1 = (B1)(B) b1;

        /** 
         * Runs fine
         */
        b = (B) b1;

        b = (B) b2;


    }
}
