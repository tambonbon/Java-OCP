public class IceCream {
        enum Flavors {
                CHOCOLATE, VANILLA, STRAWBERRY
        }
        public static void main(String[] args){
                Flavors STRAWBERRY = null;
                switch(STRAWBERRY) {
                        case Flavors.VANILLA: System.out.print("v");
                        case Flavors.CHOCOLATE: System.out.print("c");
                        case Flavors.STRAWBERRY: System.out.print("s");
                        break;
                        default: System.out.println("Missing flavors");
                }
        }
}
