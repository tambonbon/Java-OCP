package Enthuware._02JavaOOA.nestedClasses;

public class Onion {
    private String data = "skin";

    private class Layer extends Onion {
        private String data = "thegoodpart";
        public String getData() {
            return data; // this is Onion.Layer.data
        }
        public String getOnion(){
            // return Onion.data; // WRONG, bc data is NOT static !!!
            return Onion.this.data;
        }
    }

    public String getData() {
        return new Layer().getData();
    }
    public String getOnion() {
        return new Layer().getOnion();
    }
    public static void main(String[] args) {
        var o = new Onion();
        System.out.println(o.getData()); // the good part
        System.out.println(o.getOnion()); // skin
    }
}
