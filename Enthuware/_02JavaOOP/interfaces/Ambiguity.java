package Enthuware._02JavaOOP.interfaces;

public class Ambiguity {
    static interface IHello {
        public int hello(int x, int y);
        public long hello(long x, long y);
    }

    static interface IHello2 extends IHello {
        private static void print() { } // private + static OK
    }

    abstract class Hello implements IHello { } // since Hello is abstract ---> OK to not define any methods

    abstract class Hello2 implements IHello {
        public short hello(int x, int y) { return 0; } // INVALID
        // return type is incompatible 
        // because (int x, int y) is the same in overriden method in IHello

        public short hello(short x, short y) { return 0; } // VALID
    }
}
