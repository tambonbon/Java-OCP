package Enthuware._02JavaOOP.garbageCollection;

public class GC3 {
    /* The earliest line after which the object created in line11 can be garbage collected? */
    static class NewClass {
        private Object o;
        void doSth(Object s) { o = s; }
    }

    public static void main(String[] args) {
        Object obj = new Object();
        NewClass newClass = new NewClass();
        newClass.doSth(obj);
        obj = new Object();
        obj = null;
        newClass.doSth(obj);
    }
    /**
     * L.13, variable obj is being passed to `doSth()`..
     * .. in `doSth()`, this reference is assigned to instance variable o..
     * .. that variable o keeps pointing to same object until l16 is executed..
     * .. which passed a new reference (null) to `doSth()` method
     * At this point, no variable is left pointing to original object created at //1
     */
}
