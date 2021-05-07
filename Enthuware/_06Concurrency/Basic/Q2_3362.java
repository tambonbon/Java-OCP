package Enthuware._06Concurrency.Basic;

import java.util.concurrent.locks.ReentrantLock;

public class Q2_3362 {
    public static void main(String[] args) {
        AccountThreadSafe acc = new AccountThreadSafe();
        Thread t1 = new Thread(() -> acc.withdraw(10));
        t1.start();
        Thread t2 = new Thread(() -> acc.withdraw(20));
        t2.start();

        AccountNotThreadSafe accountNotThreadSafe = new AccountNotThreadSafe();
        Thread t3 = new Thread(() -> accountNotThreadSafe.lock = new ReentrantLock());
        // only possiblw when lock NOT private and final
        // ---> reference can be assigned to different object
        t3.start();
    }
}
    class AccountNotThreadSafe{
        private String id; 
        private double balance;

        ReentrantLock lock = new ReentrantLock();

        public void withdraw(double amt) {
            try {
                lock.lock();
                if (balance > amt) balance = balance - amt;
            } finally {
                lock.unlock();
            }
        }
    }

    class AccountThreadSafe{
        private String id; 
        private double balance;

        private final ReentrantLock lock = new ReentrantLock(); // declare private+final
        // so that it CANT point to some other object by another thread



        public void withdraw(double amt) {
            try {
                lock.lock();
                if (balance > amt) balance = balance - amt;
            } finally {
                lock.unlock();
            }
        }
    }

    // static class AccountAllThreadsUseSameLock {
    //     private final static ReentrantLock lock = new ReentrantLock();
    //     // this causes all Account object to use the same lock 
    // }
    

