package Enthuware._06Concurrency.Basic;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Q2_1708 {
    private CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

    public void addData(List<String> list) {
        this.list.addAll(list);
    }

    public Iterator getIterator() {
        return list.iterator();
    }

    /** 
    * If 1 thread calls addData, another thread calls getIterator on same instance at same time
    * and start iterating through its values,
    * ---> Both threads will complete their operatiosn successfully without any exeption

    * REMARKS: CopyOnWriteArrayList guarantees that Iterator acquired from will NEVER get ConcurrentModificationException 
    * 
    */
}
