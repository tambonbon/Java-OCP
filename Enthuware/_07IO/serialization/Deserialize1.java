package Enthuware._07IO.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Deserialize1 {
    static class Boo {
        public Boo() {
            System.out.println("In Boo");
        }
    }

    static class BooBoo extends Boo  implements Serializable {
        public BooBoo() {
            System.out.println("In BooBoo");
        }
    }

    static class Moo extends BooBoo implements Serializable {
        int moo = 10;
        {
            System.out.println("moo set to 10");
        }
        static {
            System.out.println("Static moo set to 10"); 
        }
        public Moo() {
            System.out.println("in Moo");
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Create an object for serializing..");
        Moo moo = new Moo();   
        moo.moo = 20; 

        FileOutputStream fileOutputStream = new FileOutputStream("Enthuware/_07IO/serialization/moo1.ser");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
        outputStream.writeObject(moo);
        outputStream.close(); 
        /* 
        Static moo set to 10 // static ini is always FIRST, even before the creation of parents' constructors
        In Boo
        In BooBoo
        moo set to 10 // instance ini
        in Moo // constructor is always last
        */

        System.out.println();
        System.out.println("Deserializing...");
        FileInputStream fileInputStream = new FileInputStream("Enthuware/_07IO/serialization/moo1.ser");
        ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
        Moo deserializedMoo = (Moo) inputStream.readObject(); // cast to Moo
        inputStream.close();

        System.out.println("Deserialize Moo() with moo.moo = 20");
        System.out.println(deserializedMoo.moo); // 20, as it returns anything that assigned within this method

        /* 
        Deserializing...
        In Boo
        In BooBoo // If BooBoo implements Serializable ---> NO this line
        Deserialize Moo() with moo.moo = 20
        20 */

        /* 
        java only calls the constructor of the first parent class thatt not implement Serialiable
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
