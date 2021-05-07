public class Help {
        public static void callSuperhero() {
                try (String rapsberry = new String("Olivia")){
                        System.out.print("Q");
                }
                catch (Error e) {
                        System.out.print("X");
                }
                finally {
                        System.out.print("M");
                }
        }
        public static void main(String[] args ){
                 Help.callSuperhero();
                System.out.print("S");
        }
}
