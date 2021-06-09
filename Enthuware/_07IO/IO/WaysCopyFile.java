package Enthuware._07IO.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.stream.Stream;

public class WaysCopyFile {
    void copyFile(File src, File dest) throws IOException {
        try (var in = new FileInputStream(src);
            var out = new FileOutputStream(dest)) {
                int b ;
                while ((b = in.read()) != -1) {
                    out.write(b);
                }
            }
    }    

    void copyFileBuffer(File src, File dest) throws IOException {
        try (var in = new BufferedInputStream(new FileInputStream(src));
            var out = new BufferedOutputStream(new FileOutputStream(dest))) {
                var buffer = new byte[1024];
                int lengthRead;

                while ((lengthRead = in.read(buffer)) >0 ) { // this .read() method takes byte[]
                    out.write(buffer, 0, lengthRead);
                    out.flush();
                }
            }
    }

    // now with Reader and Writer
    void copyFileText( File src, File dest) throws IOException {
        try (var reader = new FileReader(src);
            var writer = new FileWriter(dest)) {
                int b;

                while ((b = reader.read()) != -1) {
                    writer.write(b);
                }
            }
    }

    void copyFileTextBuffer(File src, File dest) throws IOException {
        try (var reader = new BufferedReader(new FileReader(src));
            var writer = new BufferedWriter(new FileWriter(dest))) {
                String s; // store data
                while ((s = reader.readLine()) != null) {
                    writer.write(s);
                    writer.newLine(); // need newLine, otherwise copied file NOT have line breaks
                }
            }
    }

    // copy from NIO2: deep copy version
    void copyPathDeep(Path src, Path dest) {
        try {
            Files.copy(src, dest, StandardCopyOption.ATOMIC_MOVE);
            if (Files.isDirectory(src)) // checks for directory, if it's directory ---> deep copy is done as shown below
                try (Stream<Path> s = Files.list(src))     {
                    s.forEach(path -> copyPathDeep(path, dest.resolve(path.getFileName())));
                }
        } catch (IOException exception) { }
    }

    // copy from NIO2: shallow copy version
    void copyPathShallow(Path src, Path dest) throws IOException {
        Files.copy(src, dest, StandardCopyOption.ATOMIC_MOVE);
    }
}
