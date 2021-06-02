package Enthuware._01Primitive;

public class ReturnTypeOfDivision {
    public static void main(String[] args) {
        int rate = 10;

        var amount = 1 - rate/90*1; // amount is int by default
        
        long amount2 = 1 - rate/90*1;  // can be int, long, float or double
    }
    
}
