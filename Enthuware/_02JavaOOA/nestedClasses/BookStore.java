package Enthuware._02JavaOOA.nestedClasses;

public class BookStore {
    // If the inner class is Non-static 
    // ---> all static & non-static members of outer class are accessible
    // otherwise only static are accessible

    private static final int taxId = 300_000;
    private String name;
    public String searchBook (final String criteria) {
        int count = 0;
        int sum = 0;
        sum++;

        class Enumerator {
            String iterate (int k) {
                System.out.println(count);;
                // System.out.println(sum);
                // If NOT effective final ---> NOT ACCESSIBLE FROM INNER CLASS !!!

                System.out.println(taxId);
                System.out.println(name);

                System.out.println(count); // effective final --> good
                System.out.println(k);
                System.out.println(criteria); // bc its declared final

                return "";
            }
        }
        return "";
    }
}
