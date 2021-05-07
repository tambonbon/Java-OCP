package Chapter14.generics.genericInterfaces;

/* 
* 3 ways in implementing generic interface
 */

 // 1st way
class ShippableRobot implements Shippable<Robot> {
    @Override
    public void ship(Robot t) {
        
    }
}

 // 2nd way
class ShippableAbstractRobot<U> implements Shippable<U> { // U is type parameter
    public void ship(U t) {};
}

 // 3rd way
@SuppressWarnings("rawtypes")
class ShippableCrate implements Shippable {
    @Override
    public void ship(Object t) {
        // raw types
    }
}