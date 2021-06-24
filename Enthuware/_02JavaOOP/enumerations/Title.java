package Enthuware._02JavaOOP.enumerations;

public enum Title {
    MR("MR."), MRS("Mrs."), MS("Ms");

    private String title;
    private Title(String s) { title = s;}
    public String format(String first, String last) {
        return title + " " + first + " " + last;
    }
    public static String formatStatic (String first, String last) {
        return title + " " + first + " " + last;
    }
}

class TestClass {
    
    // valid codes:
    void m1() { 
        System.out.println(Title.MR.format("Rob", "Miller")); // because format is not static
    }

    void m1Static() {
        System.out.println(Title.formatStatic("first", "last"));
    }

    // invalid codes:
    void m2() {
        System.out.println(Title.format("Rob", "MIller")); // INVALID
    }
}
