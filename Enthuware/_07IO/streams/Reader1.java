package Enthuware._07IO.streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class Reader1 { // 1392
    public void processLines(String fullFilePath) throws Exception {
        // declare and initialize "handle" here
        BufferedReader handle = new BufferedReader(new FileReader(fullFilePath));
        BufferedReader handle2 = new BufferedReader(new FileReader(new File(fullFilePath)));

        // Invalid codes
        Reader handle3 = new FileReader(fullFilePath); // Reader NOT have high level methods i.e. readLine()\
        BufferedReader handle4 = new BufferedReader(fullFilePath); // fail
        // BufferedReader can only be created using a Reader, i.e. FileReader 

        String str = null;
        while((str = handle.readLine()) != null) {

        }
    }

    /* 
    A Reader such as a FileReader provides only low level operations such as reading a single character 
    or array of characters. It does not understand the notion of "lines". 
    BufferedReader "decorates" Reader to provide higher level method readLine() by buffering characters. 
    It is an efficient way of reading characters, character arrays, and lines. 

    The same relationship exists between FileWriter and BufferedWriter but for writing.
    */
}
