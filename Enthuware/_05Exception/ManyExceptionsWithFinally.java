package Enthuware._05Exception;

import java.io.IOException;
import java.sql.SQLException;

public class ManyExceptionsWithFinally {

    public static void main(String[] args) throws Exception {
        m1();
    }

    static void m1() throws Exception {
        try {
            // line 1
            throw new IOException();
        } catch (IOException exception) {
            throw new SQLException();
        } 
        // catch (SQLException exception) {
        //     throw new InstantiationException();
        // } 
        finally {
            throw new CloneNotSupportedException();
        }
        // System.out.println("hwleoriwj"); // if this line is after finally, or finally is commented
        // ---> INVALID
    }
    /**
     * 1. The Exception that is thrown the last, is the one that is thrown by caller.
     * So, when no exceptions is thrown at line 1..
     * .. it goes to finally --> ends up throwing CloneNotSupportedExc
     * All exceptions thrown by code prior to this point are lost !
     * 
     * 2. Exception thrown by a catch CANT be caught by the following catch blocks at same level
     * ---> still goes to finally */
}
