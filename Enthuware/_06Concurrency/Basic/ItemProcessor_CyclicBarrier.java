package Enthuware._06Concurrency.Basic;

import java.util.concurrent.CyclicBarrier;

public class ItemProcessor_CyclicBarrier extends Thread implements Runnable{
    CyclicBarrier cb;
    
    public ItemProcessor_CyclicBarrier(CyclicBarrier cb) {
        this.cb = cb;
    }

    public void run() {
        System.out.println("processed");
        try {
            cb.await(); // 1 thrad calling cb.await
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception{
        var m = new Merger();

        CyclicBarrier cb = new CyclicBarrier(2, m);
        /* 
        Since there are 2 threads calling cb.await
        ---> need to create a CyclicBarrier with param as 2
         */
        
        var item = new ItemProcessor_CyclicBarrier(cb);

        new Thread(item).start(); // #1 method, only implements Runnable 
        item.start(); // #2 method, for implement Thread
        new Thread(m).start(); // okay, because m implements Runnable

        cb.await(); // 1 thread calling cb.await

    }
}

class Merger implements Runnable {
    @Override
    public void run() {
        System.out.println("Value merged");
    }
}