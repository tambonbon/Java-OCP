package Enthuware._07IO.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Deserialize2 {
    /* 
    Same as Deserialize1, but BooBoo (the superclass) implements Serializable 
    */
    static class Boo {
        public Boo() {
            System.out.println("In Boo");
        }
    }

    static class BooBoo extends Boo implements Serializable {
        public BooBoo() {
            System.out.println("In BooBoo");
        }
    }

    static class Moo extends BooBoo {
        int moo = 10;
        {
            System.out.println("moo set to 10");
        }
        public Moo() {
            System.out.println("in Moo");
        }
    }

    public static void main(String[] args) throws Exception {
        Moo moo = new Moo();   
        moo.moo = 20;

        FileOutputStream fileOutputStream = new FileOutputStream("Enthuware/_07IO/serialization/moo2.ser");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
        outputStream.writeObject(moo);
        outputStream.close(); 
        /* 
        In Boo
        In BooBoo
        moo set to 10
        in Moo
        */

        System.out.println();
        System.out.println("Deserializing...");
        FileInputStream fileInputStream = new FileInputStream("Enthuware/_07IO/serialization/moo2.ser");
        ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
        Moo deserializedMoo = (Moo) inputStream.readObject(); // cast to Moo
        inputStream.close();

        System.out.println("Deserialize Moo() with moo.moo = 20");
        System.out.println(deserializedMoo.moo);

        /* 
        Deserializing...
        In Boo
        Deserialize Moo() with moo.moo = 20
        20 
        */

        /**
         * During deserialization, the constructor of the class (or any static or instance blocks)..
         * .. is NOT executed.
         * However, if super class NOT implement Serializable, its constructor is called !
         * SO here, BooBoo and Boo are not Serializable !
         *  ----> their constructor is invoked
         */
    }   
}
