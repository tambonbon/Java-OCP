public class Zebra {
        private int x = 24;
        public int hunt() {
                String message = "x is ";
                class Stripes {
                        private int x = 0;
                        public void print() {
                                System.out.print(message +this.x);
                        }
                }
                var s = new Stripes() {} ;
                s.print(); 
                return x;
        }
        public static void main(String[] args){
                new Zebra().hunt();
        }
}
