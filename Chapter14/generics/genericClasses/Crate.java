package Chapter14.generics.genericClasses;

public class Crate<T> {
    private T contents;

    public T emptyCrate() {
        return contents;
    }

    public void packCrate(T t) {
        this.contents = contents;
    }

    static class Elephant { }

    public static void main(String[] args) {
        Elephant elephant = new Elephant();
        Crate<Elephant> crateForElephant = new Crate<>();
        crateForElephant.emptyCrate();
        crateForElephant.packCrate(elephant);
        
    }
    
    
}
