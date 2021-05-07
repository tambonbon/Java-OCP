package Enthuware._07IO.streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class Copy {
    public static void main(String[] args) throws Exception {
        copy("Enthuware/_07IO/streams/writeNonExisted4.txt", "Enthuware/_07IO/streams/writeNonExisted3.txt");
        // 4.txt 1 byte, 3.txt 4 bytes ----> 3.txt & 4.txt 1 byte
    }

    public static void copy(String file1, String file2) throws Exception {
        try (
                InputStream inputStream = new FileInputStream((file1));
                OutputStream outputStream = new FileOutputStream(file2)
        ) {
            byte[] buffer = new byte[1024];
            int bytesRead = 0;
            while((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
                System.out.println("Read and written bytes " + bytesRead);
            }
        }
    }

    public static void copyUsingRW(String file1, String file2) throws Exception {
        try (
                Reader reader = new FileReader(file1);
                Writer writer = new FileWriter(file2)
        ) {
            
        }
    }
}
