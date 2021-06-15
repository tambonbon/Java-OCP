package Enthuware._02JavaOOP.overriding;

import java.util.List;

public class TypeErasure2 {
    static class Base {
        public List<? super CharSequence> getList(int id) {
            return null;
        }
    }   

    static class Derived extends Base {
        // All 3 are valid code to override List<? super CharSequence>
        
        // @Override
        // public List<? super CharSequence> getList(int id) {
        //     return null;
        // }

        // @Override
        // public List<? super Object> getList(int id) {
        //     return null;
        // }
        
        @Override
        public List<CharSequence> getList(int id) {
            return null;
        }

    }
}
