package Enthuware._01Cast;

public class CompoundAsignmt {
    public static void main(String[] args) {
        int k = 1;
        int[] a = { 1 };
        k += (k = 4) * (k + 2);
        // the value 1 of k is saved by compound assignment operator += ...
        // .. before its right hand operand (k = 4)*(k + 2)
        // ---> Lines of thoughts:
        // có k = 4, 4 nhân (4+2) bằng 4 nhân 6 = 24 
        // chứ hông phải 4 nhân (1+2), vì 1 tính riêng 

        a[0] = a[0] + (a[0] = 4)*(a[0] + 2);

        System.out.println(k + " " + a[0]); // 25 25
    }
}
