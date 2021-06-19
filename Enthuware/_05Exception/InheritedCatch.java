package Enthuware._05Exception;

class MyException extends Throwable {}
class MyException1 extends MyException {}
class MyException2 extends MyException{}
class MyException3 extends MyException2 {}

public class InheritedCatch {
    void myMethod() throws MyException {
        throw new MyException3();
    }    

    public static void main(String[] args) {
        InheritedCatch inheritedCatch = new InheritedCatch();
        try {
            inheritedCatch.myMethod();
        }
        catch (MyException3 exception3) { // more specific exception MUST come first
            System.out.println("Exception 3 thrown");
        } 
        catch (MyException exception) {
            System.out.println("Exception thrown");
        }
        catch (MyException2 exception2) { // NOT compile
            System.out.println("Exception 3 thrown");
        } 
    }
}
