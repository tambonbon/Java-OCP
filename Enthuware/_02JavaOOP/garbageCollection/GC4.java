package Enthuware._02JavaOOP.garbageCollection;

public class GC4 {

    public Object getObject(Object a) {
        Object b = new Object(); // XXX

        Object c, d = new Object();
        c = b;
        b = a = null;
        return c;

        /** 
         * At l.9, c is assigned the reference of b 
         * ==> c --> b in XXX
         * ===> even if b & a are set to null, the object (XXX) is NOT without any reference
         * Also, c is being return --> the object created at XXX referred-to by c CANT be GC'ed !!!
         */
    }
}
