package Enthuware._13Security;

import java.time.chrono.ChronoLocalDate;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.List;

public class Security1 {
    
    static class Person {
        private String name;
        private java.time.LocalDate dob;

        public Person(String name, java.time.LocalDate dob) {
            this.name = name; this.dob = dob;
        }
        public java.time.LocalDate getDob() {
            return dob;
        }
        public String getName() {
            return name;
        }
    }

    public List<Person> getEligiblPersons(List<Person> persons) {
        var pl = new ArrayList<Person>();

        for (var p : persons) {
            if (p.getDob().isBefore()) {
                pl.add(p);
            }
        }
        return pl;
    }

    /**
     * The above code is:
     * 1. getEligiblePerson should create a deep copy of people list before processing elements
     * -- Person class is mutable (due to presence of setters) ---> dob field might change
     * ----> Person class should provide a copy constructor to create a copy of Person instance
     * 2. Person class should provide a copy constructor
     * 3. getDob method should return a clone of dob
     * -- Date is not immutable class 
     * ----> constructor should clone the passed Date object + getter should return clone of dob
     */
}
