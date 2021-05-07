package Enthuware._02JavaOOA.fieldsMethods;

/* 
Prime example of pass by value in Java
 */
public class Test5 {
    static int someint = 10;
    static Integer someInt = 10;
    int some = 10;

    public static void changeit(int a) {
        a = 20; // never change the value contined in a
    }

    public static void changeIt(Integer a) {
        a = 20;
    }

    public static void main(String[] args) {
        changeit(someint);
        System.out.println(someint);
        // we are actually passing the value 10 to the method,
        // which is then assigned to method variable a
        // in the method, 20 is assigned to 'a'
        // HOWEVER, this NOT change the value contained in someInt
        changeIt(someInt);
        System.out.println(someInt);

        Test5 some = new Test5();
        changeit(some.some); // how to use a non-static instance variable
    }
}
