package Enthuware._02JavaOOA.interfaces;

public class OverrideStatic {
    static class Base {
        static void m() { }
        void n() { }
        static void x() { }
        void y() { }
        public void z() { }
    }

    static class Sub extends Base {
        void m() {} // NOT COMPILE
        static void n() { } // NOT COMPILE
        static void x() { }
        void y() { }
        private void z() { } // NOT COMPILE
    }

    static interface BaseIntef { 
        default String getID() {
            return "ISBN123";
        }
        default String getId() {
            return "ISBN";
        }
    }

    static interface SubInterf extends BaseIntef {
        default String getID() {
            return "ISBN"; // OK to override a default and give another impl.
        }
        String getId(); // OK to re-declare a default and also make it abstract
    }

    static class SubSub implements SubInterf {
        @Override
        // Override from SubInterf, NOT BaseInter ---> NEED TO GIVE IMPL.
        public String getId() {
            return null;
        }
    }
}
