package Enthuware._10StreamsLambda.Lambda;

import java.util.function.Predicate;

public class RedeclareVarLambda {

    class Employee {
        int age;
    }

    public static boolean validateEmployee(Employee e, Predicate<Employee> p) {
        return p.test(e);
    }
    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println(validateEmployee(e, e -> e.age < 10000)); // invalid
        // e cannot redeclare another local variable defined in scope
        // valid: (e, x -> x.age)
    }
}
