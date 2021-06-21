package Enthuware._05Exception;

public class UnhandledException {
    public static void main(String[] args) { // 2. .. but the method not handle it ---> error
        UnhandledException unhandledException = new UnhandledException();
        try {
            unhandledException.m1();
        } catch (MyNewException exception) {
            unhandledException.m1(); // 1. Because the catch block throws checked exception..
        }
    }

    public void m1() throws MyNewException {
        throw new MyNewException();
    }

    public void m2() throws RuntimeException{
        throw new NullPointerException(); // Unchecked
    }
}

class MyNewException extends Exception { }