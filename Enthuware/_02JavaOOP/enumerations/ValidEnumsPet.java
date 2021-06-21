package Enthuware._02JavaOOP.enumerations;

import java.io.Serializable;

public class ValidEnumsPet {

    // Valid enums: 
    enum Pets implements Serializable {
        DOG("D"), CAT("C");
        // if an enums is only above --> invalid
        // We need constructor for them !!!
        String name;
        Pets(String s) { }
        public String getData() { return name; }
    }

    enum Pets2 {
        DOG(1, "D"),
        CAT(2, "C")
        {
            public String getData() {return type + name; }
        }, // CAT is actually an instance of an anonymous subclass of Pets !!
        // which is overriding getData() method
        FISH(3, "F");

        int type; String name;
        Pets2(int t, String s) { name = s; type = t;}
        public String getData() { return name + type ; }
    }

    // Invalid Enums
    enum Pets3 implements Serializable {
        DOG("D"), CAT("C");
        static String prefix = "I am";
        String name;
        Pets3(String s) { name = prefix + s; } // In enums ..
        // .. you CANT access non-final static field from enum's constructor !!!
        public String getData() { return name; }
    }
 
}
