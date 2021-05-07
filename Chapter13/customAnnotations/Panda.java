package Chapter13.customAnnotations;

public @interface Panda {
//    Integer height(); // Wrong
    String[] generalInfo();
//    String[][] genInfo(); // Wrong
    Size size() default Size.LARGE;
    Exercise exercise() default @Exercise(hoursPerday = 2);
}

