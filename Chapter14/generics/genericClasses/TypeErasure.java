package Chapter14.generics.genericClasses;

public class TypeErasure {
    /*
    * This is what the compiler does behind the scene,
    * when replace the T in Crate class with Elephant.
    * It replaces all refenrences to T in Crate with Object 
    * ---> after the code compiles, your generics are actually just Object types 
    */
    private Object contents;
    public Object emptyCrate() {
        return contents;
    }
    public void packCrate(Object contents) {
        this.contents = contents;
    } 
    /* 
    * This means, there's ONLY ONE .class file
    * ---> type erasure <--- process of removing generics syntax from your code */
}
