package Enthuware._13Security;

public class DoS1 {

    private byte[] allocateNew(int additional, byte[] existing) {
        byte[] newArray = new byte[existing.length + additional];
        System.arraycopy(existing, 0, newArray, 0, existing.length);
        return newArray;

        /* Remarks:
        1. This code correctly implements Accessibility and Extensibility guildlines
        2. This code is prone to one category of DoS
        -- `existing.length + addtiion` will overflow after reaching Integer.MAX_VALUE 
        */
    }
}
