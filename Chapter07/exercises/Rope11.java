public class Rope11 {
        public static void swing() {
                System.out.print("swing");
        }
        public static void climb() {
                System.out.print("climb");
        }
        public static void play() {
                swing();
                climb();
        }
        public static void main(String[] args) {
                Rope11 rope = new Rope11();
                rope.play();
                Rope11 rope2 = null;
                System.out.print("-");
                rope2.play();

        }
}
