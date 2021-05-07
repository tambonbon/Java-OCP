public class Ghost {
        public static void boo() {
                System.out.println("Not scared");
        }

        protected class Spirit {
                public void boo() {
                        System.out.println("Booo!!");
                }
        }

        public static void main(String[] args){
                var g = new Ghost().new Spirit(){};
                g.Ghost.boo();
        }
}
