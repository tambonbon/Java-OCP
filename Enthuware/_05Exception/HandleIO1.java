package Enthuware._05Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class HandleIO1 {
   public static void copy(String rec1, String rec2) throws IOException {
        try {
            // Most of IO ops throws IOException
            // -----> and this code does not handle IOException!!! <----
            InputStream inputStream = new FileInputStream(rec1);
            OutputStream outputStream = new FileOutputStream(rec2);
            byte[] buffer = new byte[1024];
            int bytesRead = 0;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
                System.out.println("Read and write bytes " + bytesRead);
            }
        } catch (FileNotFoundException e) {
            // FileNotFoundException is a subclass of IOException
            // ---> SOLUTION: replace FileNotFound by IOException,
            // or, catch a new block with IOException
        }
   } 
}
