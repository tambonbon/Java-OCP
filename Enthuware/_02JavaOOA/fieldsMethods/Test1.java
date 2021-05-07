package Enthuware._02JavaOOA.fieldsMethods;

public class Test1 {
   static Test1 ref;
   String[] arguments;

   public static void main(String[] args) {
       ref = new Test1();
       ref.func(args);
   }

    private void func(String[] args) {
        ref.arguments = args;
    }
}
