package Enthuware._02JavaOOP.overload;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class OverloadInheritance {
    static abstract class AmazingClass {
        void amazingMethod(Collection c) {
            System.out.println("got collection");
        }
    }

    static public class SpecialAmazingClass extends AmazingClass {
        void amazingMethod(List l) {
            System.out.println("got list");
        }

        public static void main(String[] args) {
            List<String> list = new ArrayList<String>();

            Collection<String> collection = list;

            AmazingClass amazingClass = new SpecialAmazingClass(); 
            // can't make new AmazingClass() because it is abstract

            amazingClass.amazingMethod(collection); // got collection
            amazingClass.amazingMethod(new ArrayList<String>()); // got collection

            SpecialAmazingClass specialAmazingClass = new SpecialAmazingClass();

            specialAmazingClass.amazingMethod(collection); // got collection
            specialAmazingClass.amazingMethod(new ArrayList<String>()); // got list
        }
    }
}
