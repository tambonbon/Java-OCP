class Person {
        static String name;
        void setName(String q) { name = q;}
}
public class Child extends Person {
        static String name;
        void setName(String w) { name = w;}
        public static void main(String[] p){
                final Child m = new Child();
                final Person t = m; // only 1 object is created
                // test for casting
                // this one compiles
                final Person person1 = new Child();
                final Child child1 = (Child)person1;
                // this one is not
                // final Person person1 = new Person();
                // final Child child1 = (Person)person1;
                System.out.println(m);
                System.out.println(t);

                m.name = "Ely";
                t.name = "Sophia";
                System.out.println(m.name + " " + t.name);

                m.setName("Webby");
                t.setName("Olivia");
                System.out.println(m.name + " " + t.name);
        }
}
