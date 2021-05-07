class CanSomething {
        public interface CanWalk {
                default void walk() { System.out.print("Walking");}
                private void testWalk() {}
        }
        public interface CanRun {
                abstract public void run();
                private void testWalk() { }
                //default void walk() {System.out.print("Running");}
        }
        public interface CanSprint extends CanWalk, CanRun {
                void sprint();
                default void walk(int speed) {
                        System.out.print("Sprinting");
                }
                private void testWalk() { } 
        } 
}
