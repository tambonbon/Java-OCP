public class Zebra extends Animal {
        public Zebra(int age) {
                super(age); // refers to constructor in Animal
        }
        public Zebra() {
                this(4); // refers to constructor in Zebra
        }
}
