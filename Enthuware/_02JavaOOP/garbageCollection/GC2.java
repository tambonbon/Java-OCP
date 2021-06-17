package Enthuware._02JavaOOP.garbageCollection;

public class GC2 {
    // How many Buddy objects will be eligible for GC at the end of the file?
    static class Buddy { }

    public static void initBuddies(Buddy[] ba) {
        // 3656
        ba[0] = new Buddy();
        ba[1] = new Buddy();
        ba[0] = ba[1];
        ba[1] = ba[2];
    }

    public static void main(String[] args) {
        Buddy[] ba = new Buddy[3];
        initBuddies(ba);
    }

    /**
     * 1. L15 creates an empty array length 3, no Buddy object is created here
     * 2. One Buddy object is created at each of l8,9
     * 3. At l10, no-one is pointing to original Buddy object pointed to by ba[0] anymore
     *  ---> eligible for GC now
     * HOWEVER, there are 2 references to the second Buddy object ---> ba[0] and ba[1] pointing to same Buddy
     * At L11, ba[1] is set to ba[2] but ba[2] is null ---> ba[1] is also null after this line
     */
}
