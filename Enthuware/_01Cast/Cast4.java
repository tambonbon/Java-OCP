package Enthuware._01Cast;

public class Cast4 {
    public static void main(String[] args) {
        Y y = new Y();
        Y k = y.val;        
        int j = (X) y.val; // stupid
    }    
}

class X { 
    int val = 10;
}

class Y extends X {
    Y val = null; // val in X is a field, so no need to override !!!
}