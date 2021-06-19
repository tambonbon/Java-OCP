package Enthuware._02JavaOOP.overriding;

public class CastClass3 {
    interface I { }
    static class A implements I { }
    static class B extends A { }
    static class C extends B {} 

    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        System.out.println(b instanceof A); // true
        System.out.println(a instanceof B); // false

        /* Run fine: */
        a =  b; // b is upcast to a
        a = (B) b; // B is-a A
        a = (A) b; //  b is explicitly upcasted
        a = (B)(I)b;
        // a = (A)(I)b;
        
        /* Runtime exception */
        b = (B)(I) a;
        // because a NOT point to an object of class B
        // The following would be fine:
        /* 
        A aPointB = new B();
        b = (B)(I) aPointB;
         */

        I i = (C) a;
        // C is-a A, which is-a I, but not run because a NOT point to object of class C
        // The following would be fine:
        
        /*
        I iPointC = new C();
        i = (C) iPointC;
        i = iPointC;
         */

         /* Compile error */
        // a = (I) b; 
        // an I is not an A

        // b = a;
    }

    // Another set of example:
    static interface Animal { }
    static class FourLegs implements Animal { }
    static class Cat extends FourLegs { }
    static class PersianCat extends Cat { }

    static class Zoo { 
        public static void main(String[] args) {
            // all normal declaration: 
            FourLegs fourLegs = new FourLegs();
            Cat cat = new Cat();
            PersianCat persianCat = new PersianCat();
            
            // polymorphism declaration:
            Animal animalWithFourLegs = new FourLegs();
            Animal animalLooksLikeCat = new Cat();
            Animal animalLooksLikePersianCat = new PersianCat();
            Cat catLooksLikePersianCat = new PersianCat();
            FourLegs fourLegsCat = new Cat();

            /* Valid cast (comment unrelated casts) */
            // fourLegs = cat;
            // fourLegs = (Cat) cat;
            // fourLegs = (Cat)(Animal) cat; // (Animal)(Cat) is WRONG\
            // fourLegs = (FourLegs)(Animal) cat;
            // fourLegs = (Cat) persianCat;

            // these 2 lines are fine
            // fourLegs = (PersianCat) catLooksLikePersianCat; // in contrast to L85
            // persianCat = (PersianCat) catLooksLikePersianCat;

            // cat = (PersianCat) catLooksLikePersianCat;

            persianCat = (PersianCat)(Cat) catLooksLikePersianCat; // in contrast to L92

            /* Runtime exceptions: */
            fourLegs = (PersianCat) cat; // invalid cast.. 
            // .. because a Cat is not always a PersianCat
            fourLegs = (PersianCat) animalLooksLikeCat; // invalid cast..
            // .. because an animalCat NOT is-a PersianCat (it can be any kind of Cat)
            fourLegs = (PersianCat) fourLegs; // invalid cast..
            // .. because a FourLegs NOT is-a Cat, and thus NOT is-a PersianCat

            persianCat = (PersianCat)(Cat) animalLooksLikeCat; // Cat CANT be cast to PersianCat ..
            // .. because the declared type (rhs) of animalLooksLikeCat is Cat
            // .. and Cat is-not-a PersianCat
            // L82 works because catLooksLikePersianCat has PersianCat in his rhs
            
            /* Compiletime error: */
            // persianCat = (Cat) animalLooksLikeCat; // error cast ..
            // .. because you cannot cast Cat to a PersianCat
            // .. same problem if you are casting Cat to a catLooksLikePersianCat

            // persianCat = (Cat) catLooksLikePersianCat; // error cast ..
            // .. even though you can cast a catLooksLikePersianCat to a Cat ..
            // .. that subsequent Cat CANNOT be a persianCat !!
            // Solution: 
            // 1. Change persianCat to cat 
            // 2. (PersianCat)(Cat)

            // catLooksLikePersianCat = animalLooksLikeCat; // error
            // persianCat = catLooksLikePersianCat; // error ..
            // .. because a catLooksLikePersianCat is not always a persian cat

            // persianCat = catLooksLikePersianCat;// Cat CANT convert to PersianCat

            // invalid cast:
            // cat = fourLegs;
        }
    }
}
