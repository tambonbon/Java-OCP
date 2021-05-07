public class ReturningValues{
        public static void main(String[] args) {
                int number = 1;
                String letters = "abc";
                number(number); // not assign anything
                System.out.println(number);
                letters = letters(letters); // re-assign
                System.out.println(letters);
                number = number(number);
                System.out.println(number + letters);
        }
        public static int  number(int number){
                number++;
                return number;
        }
       public static String letters(String letters) {
                letters += "d";
                return letters;
        }
}
