package Chapter19;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.PrintWriter;


public class WriteNonexisted { //Q.1905
    public static void main(String[] args) throws Exception{
        var write = new FileWriter("text.txt");
        write.write("hello");
        write.close();

        createFile("Enthuware/_07IO/streams/writeNonExisted.txt");
        createFile2("Enthuware/_07IO/streams/writeNonExisted2.txt");
        createFile3("Enthuware/_07IO/streams/writeNonExisted3.txt");
        createFile4("Enthuware/_07IO/streams/writeNonExisted4.txt");
        createFile5("Enthuware/_07IO/streams/writeNonExisted5.txt");

    }

    public static void createFile(String name) throws Exception{
        try (OutputStream os = new FileOutputStream(name)) {
            var pw = new PrintWriter(os);
            pw.write(1);
            // PrintWriter's write method writes a 'single character' to the file
            // the size in bytes of a character depends on default encoding of the underlying platform
            // i.e. if UTF-8 ---> only 1 byte will be written and the size of the file will be 1 byte



        }
    }

    public static void createFile2(String name) throws Exception {
        try (OutputStream os = new FileOutputStream(name)) {
            var bufferOutputStream = new BufferedOutputStream(os);
            var printWriter = new PrintWriter(bufferOutputStream);
            printWriter.print(99);
            // PrintWriter's print(int) method actually writes the string produced by String.valueOf(int)...
            // ... this string is translated to bytes according to default character encoding
            bufferOutputStream.flush(); // should always flush before close buffer
            bufferOutputStream.close(); // should always close buffer
        }
    }

    public static void createFile3(String name) throws Exception {
        try (OutputStream os = new FileOutputStream(name)) {
            var dataOutputStream = new DataOutputStream(os);
            dataOutputStream.writeInt(99);
            // 4 bytes will be created
        }
    } 

    public static void createFile4(String name) throws Exception {
        try (OutputStream os = new FileOutputStream(name)) {
            os.write(99);
            // write(int b) method take an int, but write only the low 8 bits (i.e. 1 byte) of that integer

            // DataOutputStream provides methods such as writeInt writeChar writeDouble
            // ---> if want to write integer to file ---> should use writeInt(1)

        }
    }

    public static void createFile5(String name) throws Exception {
        try (OutputStream os = new FileOutputStream(name)) {
            DataOutputStream dataOutputStream = new DataOutputStream(os);
            dataOutputStream.write(99);
            // a file of size 1 will be created
        }
    }
}
