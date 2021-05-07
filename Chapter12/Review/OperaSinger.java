public class OperaSinger {
       public static void main(String[] args){
               check((h, l) -> h., 5);
       } 
       private static void check(Sing sing, int volume) {
               if (sing.isTooLoud(volume, 10)) System.out.println("not so great");
               else System.out.println("great");
       }
}
interface Sing {
        boolean isTooLoud(int volume, int limit);
}
