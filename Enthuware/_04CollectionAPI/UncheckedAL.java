package Enthuware._04CollectionAPI;

import java.util.ArrayList;
import java.util.List;

public class UncheckedAL {
    static class Student { }

    public static void main(String[] args) {
        var student = new Student();

        List allStudents = new ArrayList<>(); // Not that diamond op is empty

        allStudents.add(student);

        Student student2 = allStudents.get(0); // Invalid
        // ArrayList<>() means the type of objects in the list is Object..
        // ---> CANT assign an object gotten from this list to a Student variable!
    }
}
