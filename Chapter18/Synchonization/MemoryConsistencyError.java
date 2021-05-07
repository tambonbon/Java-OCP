package Chapter18.Synchonization;

public class MemoryConsistencyError {
    /**
     * MemoryConsistencyError occurs when different threads have inconsistent view of what should be in the same data.
     * 
     * E.g. Thread A increments `counter` = 0, then shortly afterwards thread B prints out `counter`;
     * as the 2 statements are executed in separated threads, the value printed out might be 0, not 1
     * 
     * Happens-before relationship prevents this error.
     * 
     * The results of a write by one thread are guaranteed to be visible to a read by another thread
     * only if the write operation happens-before the read operation. 
     * 
     * The synchronized and volatile constructs, as well as the Thread.start() and Thread.join() methods,
     * can form happens-before relationships.
     * 
     * `join` method allows one thread to wait for the completion of another
      */
}
