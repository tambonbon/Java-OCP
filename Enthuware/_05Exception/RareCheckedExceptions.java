package Enthuware._05Exception;

public class RareCheckedExceptions {
    public static void method(int x) throws ClassNotFoundException, NoSuchFieldException { // or Exception
        // ClassNotFound and NoSucFile are checked exceptions..
        // .. extending from ReflectiveOperationException
        try {
            if (x == 0) { throw new ClassNotFoundException();}
            else throw new NoSuchFieldException();
        }  catch (RuntimeException exception) {
            throw exception;
        }
    }
}
