package Chapter13.applyingAnnotations;

public @interface Injured {
    // for short-hand ---> MUST HAVE value
    // can be optional or required (here is required)¡
    String value() ;
    // all other elements must be optional
    int seriousness() default 1;
    boolean paid() default true;
}
