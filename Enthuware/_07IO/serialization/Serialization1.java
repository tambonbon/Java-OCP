package Enthuware._07IO.serialization;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;

public class Serialization1 {
    /**
     * Question: How to serialize a Portfolio object...
     * ... while preserving the state of Bond objects contained in Portfolio?
     */
    static class Bond implements Serializable { // 1. Just make Bond class implements Serializable
        String ticker;
        double coupon;
        LocalDate maturity;
    }

    static class Portfolio implements Serializable {
        String accountName;
        transient Bond[] bonds; // 2. Make bonds array transient and implement readObject/writeObject
        
        private void writeObject(ObjectOutputStream objectOutputStream) throws Exception {
            objectOutputStream.defaultWriteObject(); // write the non-transient and non-static object to this stream
            objectOutputStream.writeInt(bonds.length);
            // write the state of bond objects
            for (int i = 0; i < bonds.length; i++) {
               objectOutputStream.writeObject(bonds[i].ticker) ;
            }
        }

        private void readObject(ObjectInputStream objectInputStream) throws Exception {
            objectInputStream.defaultReadObject();
            int n = objectInputStream.readInt();
            this.bonds = new Bond[n];
            // read the state of bond objects
            for (int i = 0; i < bonds.length; i++) {
                bonds[i] = new Bond();
                bonds[i].ticker = (String) objectInputStream.readObject();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Portfolio portfolio = new Portfolio();
    }
}
