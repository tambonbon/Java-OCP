package Chapter18.Synchonization;

/**
 * Interference happens when two operations, running in different threads, but acting on the same data, interleave.
 * This means that the two operations consist of multiple steps, and the sequences of steps overlap.
 * 
 * Suppose Thread A invokes increment at about the same time Thread B invokes decrement.
 * If the initial value of c is 0, their interleaved actions might follow this sequence:

    Thread A: Retrieve c.
    Thread B: Retrieve c.
    Thread A: Increment retrieved value; result is 1.
    Thread B: Decrement retrieved value; result is -1.
    Thread A: Store result in c; c is now 1.
    Thread B: Store result in c; c is now -1.

 * Thread A's result is lost, overwritten by Thread B. This particular interleaving is only one possibility. 
 * Under different circumstances it might be Thread B's result that gets lost, or there could be no error at all. 
 * Because they are unpredictable, thread interference bugs can be difficult to detect and fix.
 */
public class ThreadInference {
    class Counter {
        private int c = 0;

        public void increment() {
            c++;
        }

        public void decrement() {
            c--;
        }

        public int value() {
            return c;
        }
    }
}
