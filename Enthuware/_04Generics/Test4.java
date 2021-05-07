package Enthuware._04Generics;

class MyGenericClass<T> { // this <T>....
    public <T> String transform(T t) { // ... has no relation to this <T>
        return t.toString() + "-" + t.hashCode();
    }
}

public class Test4 {
   public static void main(String[] args) {
      MyGenericClass gc = new MyGenericClass();  
      System.out.println(gc.transform(1)); // int (primitives) NOT have hashCode?
      System.out.println(gc.transform("hello"));

      MyGenericClass<String> gcStr = new MyGenericClass<String>(); 
      // even though <T> in GenericClass is String...
      System.out.println(gcStr.transform(1.1)); // ... doesnt mean <T> in transform is String
   }
    
}
