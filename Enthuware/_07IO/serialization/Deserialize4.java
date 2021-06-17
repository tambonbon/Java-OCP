package Enthuware._07IO.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Deserialize4 {
    // note that these classes NOT have no-args constructors
    static class Boo {
        int boo = 10;
        public Boo(int k) {
            System.out.println("In Boo k = " + k);
        }
    }

    static class BooBoo extends Boo{
        // public BooBoo() { super(2); } // WONT THROW EXCEPTION IF UNCOMMENT
        public BooBoo(int k) {
            super(k);
            System.out.println("In BooBoo k = " + k);
        }
    }

    static class Moo extends BooBoo implements Serializable {
        int moo = 10;
       public Moo() {
           super(5);
            System.out.println("in Moo");
        }
    }

    public static void main(String[] args) throws Exception {
        
        System.out.println("Create an object ...");
        var moo = new Moo();
        var objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("Enthuware/_07IO/serialization/moo4.ser")));
        objectOutputStream.writeObject(moo); // write moo
        objectOutputStream.close();

        System.out.println("Deserialize object ...");
        var ObjectInputStream = new ObjectInputStream(new FileInputStream("Enthuware/_07IO/serialization/moo4.ser"));
        moo = (Moo) ObjectInputStream.readObject();
        ObjectInputStream.close(); // THIS WILL THROW EXCEPTION AT RUN TIME

        /** 
         * 1. No problem in serialize Moo object
         * 2. However, while deserialize, JVM can't find any no-arg constructors ..
         * .. that can be invoked to initialize BooBoo..
         * .. No-arg constructor is required in BooBoo because ..
         * .. BooBoo is the most specific class in the hierachy that NOT implement Serializable
         * ----> throw InvalidClassException: no valid constructor
         */
        
    }
}
