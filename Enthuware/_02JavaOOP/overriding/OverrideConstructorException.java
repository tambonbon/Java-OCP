package Enthuware._02JavaOOP.overriding;

import java.io.FileNotFoundException;
import java.io.IOException;

public class OverrideConstructorException {
    static class PortConnector {
        public PortConnector(int port) throws IOException { 
            // A constructor is free to throw any exception
        }
        public PortConnector() throws IOException {}
    }

    static class CleanConnector extends PortConnector {
        /**
         * 1. It's possible to define CC not throw IOException at instantiation;
         *      it can throw Exception instead
         * public CleanConnector(int port) throws Exception { super(port); }
         * 
         * 2. CC's constructor can throw any exception but it MUST also declare IOException
         *       (or its superclass)
         * public CealConnector(int port) throws IOException, FileNotFoundException, SomeException { }
         * 
         * ---> Rule for overriding constructors DIFFERENT from methods <---
         *      Overriding method CANT throw superclass exception,
         *      while constructor of subclass CANT throw subclass exception
         * 
         */
        public CleanConnector(int port) throws FileNotFoundException { super(port);} // invalid
    }
    
    // another example
    static class A {
        public A() throws IOException { } // constructor
        void m1() throws IOException { } // method
    }

    static class B extends A {
        // Exception valid here, but FileNotFound invalid
        public B() throws Exception { }
        // public B() throws FileNotFoundException{}

        // FileNotFound valid here, but Exception invalid
        public void m1() throws FileNotFoundException { }
    }
}
