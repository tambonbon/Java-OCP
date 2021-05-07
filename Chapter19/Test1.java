package Chapter19;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A implements Serializable {
    public String str = "123";
    // public String prt = "ddd"; // uncomment this to add new field for deserialization
}

public class Test1 {
    public static void main(String[] args) throws Exception {
        
        // Serialization
   /*      A a = new A();

        ObjectOutputStream oos = new ObjectOutputStream(
            new FileOutputStream("/Users/tammy/javaProjects/OCP/Chapter19/z.txt"));

        oos.writeObject(a);
        oos.flush();
        oos.close(); */

        // Deserialization
        A a = null;
        ObjectInputStream ois = new ObjectInputStream(
            new FileInputStream("/Users/tammy/javaProjects/OCP/Chapter19/z.txt")
        );
        a = (A) ois.readObject();
        System.out.println(a);  
    }    
}
