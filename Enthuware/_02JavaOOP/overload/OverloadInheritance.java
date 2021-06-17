package Enthuware._02JavaOOP.overload;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class OverloadInheritance {

    static abstract class AmazingClass {
        void amazingMethod(Collection c) {
            System.out.println("got collection");
        }
        void method(Collection c) { System.out.println("In Base AmazingClass");}
    }

    static public class SpecialAmazingClass extends AmazingClass {
        void amazingMethod(List l) { // THIS IS NOT OVERRIDE !!! (overload rather)
            System.out.println("got list");
        }
        void method(Collection c) { System.out.println("In Sub SpecialAmazingClass");}

        public static void main(String[] args) {
            List<String> list = new ArrayList<String>();

            Collection<String> collection = list;

            AmazingClass amazingClass = new SpecialAmazingClass();  // effectively, amazingClass has 2 amazingMethod methods
            // can't make new AmazingClass() because it is abstract
            // since amazingClass's declared type is AmazingClass ..
            // .. ---> only one applicable method that can be invoked on amazingClass..
            // .. which is amazingMethod(Collection c)

            amazingClass.amazingMethod(collection); // got collection
            amazingClass.amazingMethod(new ArrayList<String>()); // got collection
            amazingClass.method(collection); // In Sub SpecialAmazingClass

            // create a new object SpecialAmazingClass
            SpecialAmazingClass specialAmazingClass = new SpecialAmazingClass();

            specialAmazingClass.amazingMethod(collection); // got collection..
            // .. because putting a collection is more specific than putting a list
            // ---> return the method from AmazingClass (amazingMehthod(Collection c))
            specialAmazingClass.amazingMethod(new ArrayList<String>()); // got list
        }
    }
}
