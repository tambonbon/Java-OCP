package Enthuware._02JavaOOP.overriding;

public class Override1 {
    static class Book {
        protected final int pages = 100;
         void mA() {
            System.out.println("In B.mA " + pages);
        }
    }

    static class Encyclopedia extends Book {
        private int pages = 200; // this hides pages from Book
        void mB() {
            System.out.println("In E.mB " +pages);
        }
        
        void mA() {
            // CANNOT OVERRIDE final method 
            System.out.println("In E.mA " + pages);
        }
    }

    public static void main(String[] args) {
        Book b1 = new Encyclopedia(); // ok, Encyclopedia is-a Book
        Book b2 = new Book();

        System.out.println(b1.pages); // 100 from Book
        System.out.println((Encyclopedia) b1.pages); // invalid

        b1.mA(); // Book does have method mA
        b1.mB(); // invalid because declared type of reference b1 is Book, which NOT have mB

    }
}
