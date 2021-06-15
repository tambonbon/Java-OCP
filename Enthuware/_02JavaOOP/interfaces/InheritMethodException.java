package Enthuware._02JavaOOP.interfaces;

import java.io.IOException;
import java.sql.SQLException;

public class InheritMethodException {
    interface I1 {
        void m1() throws IOException;
    }

    interface I2 {
        void m1() throws SQLException;
    }

    class Combine implements I1, I2 {
        @Override
        public void m1() throws IOException { // invalid, overiding method can't include any new checked exceptions
        // here, in this case, IOException is new relatively to I2.m1()
        // ---> So, NOT throw anything is valid
        }
    }
}
