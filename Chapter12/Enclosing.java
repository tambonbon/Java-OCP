public class Enclosing {
        protected class Nested {
                private int price = 6;
        }
        public static void main(String[] args) {
                Enclosing enclosing = new Enclosing();
                Nested nested = enclosing.new Nested();
                // if `Nested` is static ---> Nested nested = new Nested();
                System.out.println(nested.price);
        }
}
