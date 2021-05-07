package Chapter13.customAnnotations;

public @interface Exercise {
    int hoursPerday(); // required element
    int startHour() default 6; // optional element
}
