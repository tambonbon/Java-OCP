package Enthuware._06Concurrency.Basic;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class StudentReadWriteLock {
    private Map<String, Integer> marksObtains = new HashMap<String, Integer>();
    private ReadWriteLock lock = new ReentrantReadWriteLock();
    // ReadWriteLock give one read lock (lock.readLock) + write lock (lock.writeLock)
    // A read lock can be locked by multiple threads SIMULTANEOUSLY (lock.readLock.lock) if write lock is free
    // if write lock NOT free ---> read lock CANT be locked
    // A write lock can be locked (lock.writeLock.lock) ONLY BY ONE THREAD + NO THREAD already has read/write lock
    // ***** ----> If 1 thread is reading, others can read, BUT no thread can write <---- *****
    // ***** ----> If 1 thread is writing, no other thread can read or write <---- *****

    public void setMarksInSubject(String subject, Integer marks) { // write
        lock.writeLock().lock();
        try {
            marksObtains.put(subject, marks);
        } finally {
            lock.writeLock().unlock();
        }
    }

    public double getAverageMarks() { // read
        lock.readLock().lock();
        double sum = 0.0;
        try {
            for (Integer mark : marksObtains.values()) {
                sum = sum + mark;
            }
            return sum/marksObtains.size();
        } finally {
            lock.readLock().unlock();
        }
    }

    public static void main(String[] args) {
        final StudentReadWriteLock student = new StudentReadWriteLock();

        // create 1 thread keeping adding marks
        new Thread(){
            public void run() {
                int x = 0;
                while(true) {
                    int m = (int) (Math.random()*100);
                    student.setMarksInSubject("Subject " +x, m);
                    x++;
                }
            }
        }.start();

        // create 5 threads getting average marks
        // for (int i = 0; i < 5; i++) {
        //     new Thread(){
        //         public void run() {
        //             while(true) {
        //                 double av = student.getAverageMarks();
        //                 System.out.println(av);
        //             }
        //         }
        //     }.start();
        // }
    }
}
