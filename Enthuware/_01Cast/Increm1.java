package Enthuware._01Cast;

public class Increm1 {
    public static void main(String[] args) {
        /**
         * i == ++j NOT SAME i == j++
         *      i == ++j ---> j is first incremented. then compared with i
         *      i == j++ ----> j is first compared, then incremented 
         */
        int i = 1;
        int j = i++;
        if ((i==++j) | (i++ == j)) {
            i +=j;
        }
        System.out.println(i); // 5

        i = 1;
        j = i++;
        if ((i==++j) || (i++ == j)) {
            i +=j;
        }
        System.out.println(i); // 4, because || ---> 2nd condition NOT checked
    }
}
