package Enthuware._04Arrays;

public class CloneArray {
    public static void main(String[] args) {
        int[][] twoD = {{1,2,3}, {4,5,6,7}};

        System.out.println(twoD[0] == twoD.clone()[0]); // true 

        /**
         * Clone method returns a SHALLOW CLONE, which means..
         * if we have:
         *  Student[] s1 = new Student[]{new Student(), new Student()}
         *  Student[] s2 = s1.clone()
         * -----> s2 will now point to a new array of Student objects ..
         *  .. but the elements of new array will point to SAME Students object..
         *  .. that were in original array
         * In other words: when you clone an array <==> array is cloned but elements are not cloned
         * thus, s1 == sa2 -> false, but s1[0] == s2[0] -> true
         */
    }
}
