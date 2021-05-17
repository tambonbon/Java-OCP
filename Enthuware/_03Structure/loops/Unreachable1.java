package Enthuware._03Structure.loops;

public class Unreachable1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int counter = 0;

        for (var value : arr) {
            System.out.println("counter = " +counter);
            if (counter >=5) {
                break;
            }  else continue;// continue makes the next lines unreachable
            if (value > 4) { 
                arr[counter] = value + 1;
            } 
            counter++;
        }
        System.out.println(arr[counter]); // 6
    }
}
