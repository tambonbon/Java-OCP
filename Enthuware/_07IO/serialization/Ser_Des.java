package Enthuware._07IO.serialization;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Goose implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private Boolean friendly;
    private transient String favoriteFood = "Pizza";
    private transient String species;
    private static int type = 2;

    /* 
    Upon deserialization, none of constructors and instance initializer NOT EXECUTED
     */
    { this.favoriteFood = "Burger"; }

    public Goose(String name, int age, Boolean friendly, String favFood, String species, int type) {
        this.name = name;
        this.age = age;
        this.friendly = friendly;
        this.favoriteFood = favFood;
        this.species = species;
        this.type = type;
    }

    // However, this constructor with all non-transient variables are still needed
    public Goose(String name, int age, Boolean friendly) {
        this.name = name;
        this.age = age;
        this.friendly = friendly;
    }

    public Goose() { 
        this.name = "Unknown";
        this.favoriteFood = "Pho";
    }

    @Override
    public String toString() {
        return this.name + " " + this.age + " " + this.friendly + " " + this.favoriteFood + " " 
         + this.species + " " + this.type;
    }
    
}
public class Ser_Des {
    static void serialize(List<Goose> gooses, File dataFile) throws IOException {
        try ( var out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(dataFile)))) {
            for (Goose goose : gooses) out.writeObject(goose);
        }
    }

    static List<Goose> deserialize (File datadFile) throws IOException, ClassNotFoundException {
        var gooses = new ArrayList<Goose>();
        try (var in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(datadFile)))) { // BufferredInputStream(FileReader is undefined)
            while (true) {
                var object = in.readObject();
                if (object instanceof Goose) gooses.add((Goose) object); // need cast
            }
         }
        catch (EOFException exception) { } // NEED to use infinite loop to precess data..
        // .. which throws EOFException when the end of stream is reached
        
        return gooses;
            
    }

    public static void main(String[] args) throws Exception {
        var gooses = new ArrayList<Goose>();
        gooses.add(new Goose("Grod", 5, false, "Ows", "Duck", 3));
        gooses.add(new Goose("Ishmaek", 8, true,  "Ows", "Duck", 1));
        // Output: [Grod 5 false null null 1, Ishmaek 8 true null null 1]
        
        /* 
        Because type is static, it WILL DISPLAY WHATEVER THE VALUE SET LAST !!! ---> 1 
        HOWEVER, if we pergorm deserialization and print on startup ---> 2, which is the value initialized 

        Further, Java only calls the constructor of 1st non-serializable parent class in the class hierachy
        */
        File dataFile = new File("Enthuware/_07IO/IO/3.txt");

        // serialize the object
        serialize(gooses, dataFile);

        // deserialize
        var goosesFromDisk = deserialize(dataFile);
        System.out.println(goosesFromDisk);
    }
}
