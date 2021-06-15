package Enthuware._07IO.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Deserialize3 {
    
    static class Booby { // if impl Serial --> result: 100 20 30
        int i;

        public Booby() {
            i = 10;
            System.out.println("Booby");
        }
    }

    static class Dooby extends Booby implements Serializable {
        int j;

        public Dooby() {
            j = 20;
            System.out.println("Dooby");
        }
    }

    static class Tooby extends Dooby {
        int k;

        public Tooby() {
            k = 30;
            System.out.println("Tooby");
        }
    }

    public static void main(String[] args) throws Exception {
        var t = new Tooby();
        t.i = 100;

        var output = new ObjectOutputStream(new FileOutputStream("Enthuware/_07IO/serialization/testTooby.ser"));
        output.writeObject(t);
        output.close();

        var input = new ObjectInputStream(new FileInputStream("Enthuware/_07IO/serialization/testTooby.ser"));
        t = (Tooby) input.readObject();
        input.close();

        System.out.println(t.i + " " + t.j + " " + t.k); // 10 20 30

        /**
         * Objects that NOT marked Serializable ---> CANT serialized !!!
         * 1. Booby NOT impl Serial --> its objects CANT serialized
         * 2. Dooby impl Serial ---> good
         * 3. Tooby extends Dooby ---> good
         * 
         * When serialize object of class Tooby, ONLY DATA MEMBERS of Dooby and Tooby will be serialized !
         *   (data members of Booby NOT serialzed)
         * -----> value of i (which is 100) at the time of serialization ====> NOT SAVED 
         * 
         * When reading the object back (deserialze)...
         * ... constructors of the serializable classes are NOT CALLED
         * .... Their data members are set directly from values present in serialized data
         * ..... Constructors of unserialized class are CALLED
         * ---> Constructors of Tooby&Dooby are NOT CALLED, but Booby 
         */
    }
}
