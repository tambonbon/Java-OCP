package Enthuware._05Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class OverrideDeclare1 {
    class Mammal {
        public void do1() throws IndexOutOfBoundsException {

        }
    }

    class Lion extends Mammal {
        @Override
        public void do1() {
            // TODO Auto-generated method stub
            super.do1();
        }
    }

    class Insects {
        public void do2() throws IOException{
            
        }
    }

    class Bees extends Insects{
        @Override
        public void do2() throws IOException {
            
        }
    }
}
