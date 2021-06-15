package Enthuware._02JavaOOP.overriding;

public class Polymorphism3 {
    /** Always remember:
     * 1. Instance metethods are overriden
     * 2. Variables + static methods are hidden
     * ---> which instance method is invoked depends on the class of actual object,
     * ---> which field (and static method) is accessed depends on the class of variable
     */

    static class Baap {
         public int h = 4;
         public int getH() {
             System.out.println("Baap " + h);
             return h;
         }
     }
    static class Beta extends Baap {
          public int h = 44;
          public int getH() {
              System.out.println("Beta " + h);
              return h;
          }
      }
       public static void main(String[] args) {
           Baap baap = new Beta();
           System.out.println(baap.h + " " + baap.getH()); // 4 44
           // here baap refers to an object of type Beta, so baap.getH calls overriden..
           //. .. but the type of reference of baap is Baap, so baap.h refers to Baap's h

           Beta beta = (Beta) baap;
           System.out.println(beta.h + " " + beta.getH()); // 44 44
       }
}
