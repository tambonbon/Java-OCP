package Chapter12;

public class Cat implements Walk, Run {
    public int getSpeed() {return 3; }
    
    int getWalkSpeed() {
        return Walk.super.getSpeed();
    }
    public static void main(String[] args) {
        
        System.out.println(new Cat().getSpeed());
        System.out.println(new Cat().getWalkSpeed());
    }
    
}

interface Walk {
    default int getSpeed() { return 5; }
}
interface Run {
    default int getSpeed() { return 10; }
}

interface Schedule {
    default void wakeUp() { checkTime(7); }
    default void haveBreakfast() { checkTime(9); }
    default void haveLunch() { checkTime(12); }
    default void workOut() { checkTime(18); }
    
    private static void checkTime(int hour) {
        if (hour > 17) {
            System.out.println("u r late");
        }
        else {
            System.out.println("u r not late");
        }
    }
}