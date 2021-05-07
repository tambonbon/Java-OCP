package Enthuware._01Primitive;

import jdk.jfr.Unsigned;

public class Parse1 {
    public static void main(String[] args) {
        String str = "10";
        int iVal   = 0;
        Double dVal = 0.0;

        try {
            iVal = Integer.parseInt(str, 2); // return 2
            if ((dVal = Double.parseDouble(str)) == iVal) { // why?
                System.out.println("equal");
            }
        } catch (NumberFormatException exception) {
            System.out.println("Exception in parsing");
        }
        System.out.println(iVal + " " + dVal); // 2 10.0

         byte b = 0;
         
    }
}
