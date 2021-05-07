public class ZooTicket {
        private String name = "BestZoo";
        {System.out.print(name+"-"); }
        private static int COUNT = 0;
        static {
                System.out.print(COUNT +"-");
        }
        static {
                COUNT += 10; 
                System.out.print(COUNT+"-");
        }
        public ZooTicket() {
                System.out.print("z-");
        }
        public static void main(String... patrons) {
                new ZooTicket();
        }

}
