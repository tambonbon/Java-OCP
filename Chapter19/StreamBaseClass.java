import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;
import java.io.Reader;


public class StreamBaseClass {
    public static void main(String[] args) throws IOException {
        // new BufferedOutputStream(new FileWriter("z.txt"));
        new BufferedWriter(new FileWriter("z.txt"));
        var reader = new BufferedReader(new java.io.InputStreamReader(System.in));
        String usString = reader.readLine();
        System.out.println("You entered: " + usString);
    }

    public void readData(Reader is) throws IOException {
        if (is.markSupported()) {
            is.mark(100);
            System.out.println((char) is.read());
        }
    }
}
