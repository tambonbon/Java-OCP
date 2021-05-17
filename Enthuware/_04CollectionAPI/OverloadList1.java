package Enthuware._04CollectionAPI;

import java.util.Collection;
import java.util.Map;

public class OverloadList1 {
    static class Event {
        public void process(Collection collection) {
            collection.forEach(o -> System.out.println(o));
        }
    }

    static class MapEvent extends Event {
        public void process(Map events) {
            /* Valid codes */
            super.process(events.values());
            process(events.values()); // because this process is not overriding..
            //.. --> actually no need to use super.

            /* Invalid codes */
            events.forEach((k,v) -> process(v)); // type of v is object, so no method available
        }
    }
}
