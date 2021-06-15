package Enthuware._02JavaOOP.garbageCollection;

public class GB1 {

    public Object getObject(Object a) { 
        Object b = new Object(); // XX
        
        Object c, d = new Object(); //1
        c = b; //2 
        b = a = null; //3
        return c; //4

        /* The objects created at line XX will NEVER be eligible for GC !
        At line 2, c is assigned the reference of b ---> c is pointing to b
        ----> so even if at //3, b and a are null, the object is not without any reference
        also, at //4 c is being returned!
         */
    }
}
