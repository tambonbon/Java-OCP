package Enthuware._02JavaOOP.interfaces;

import java.util.Collection;

public class Test7 {
    interface Processor {
        Iterable process();
    }

    interface ItemProcessor extends Processor {
        Collection process();
        // Collection extends Iterable ---> valid
    }

    interface WordProcessor extends Processor {
        String process();
        // NOT valid
    }

    interface GenericProcessor1 extends Processor, ItemProcessor {
        // valid, and an interface can extend many interfaces
    }

    interface GenereicProcessor2 extends ItemProcessor, WordProcessor{ 
        // Not valid
    }
}
