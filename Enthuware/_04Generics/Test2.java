package Enthuware._04Generics;

import java.util.ArrayList;

class Book {}
class TextBook extends Book {}

class BookList extends ArrayList<Book> {
    public int count = 0 ;
    public boolean add(Book o) { 
        // if it wants to override add in ArrayList,
        // ---> needs to override add(Book) as defined in class signature
        // otherwise (say, add(Object o)) ---> type erasure error
        return true;
    }
}