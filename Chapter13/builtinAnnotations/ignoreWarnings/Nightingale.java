package Chapter13.builtinAnnotations.ignoreWarnings;

import java.util.ArrayList;
import java.util.List;

class SongBird {
    @Deprecated static void sing(int volume) {

    }
    static Object chirp(List<String> data) {
        return data.size();
    }
}

public class Nightingale {
    public void wakeUp() {
        SongBird.sing(10);
    }
    @SuppressWarnings("unchecked")
    public void goToBed() {
       SongBird.chirp(new ArrayList()); // type safety (unchecked) and raw type(rawtypes)
    }
}

