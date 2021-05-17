package Enthuware._10StreamsLambda.Lambda;

import java.util.function.Supplier;

public class Employee {
    int age;

    public static void main(String[] args) {
        Employee employee = new Employee();

        Supplier<Employee> supplier = () -> {
            employee.age = 40;
            return employee;
        };

        employee.age = 50;

        System.out.println(supplier.get().age);
        // Even though age is set to 50...
        // .. but at L18, lambda expression define at L11 is executed..
        // ----> it changes age back to 40
    }    
}
