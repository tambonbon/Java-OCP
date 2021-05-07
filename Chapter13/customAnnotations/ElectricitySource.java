package Chapter13.customAnnotations;

public @interface ElectricitySource {
    public int voltage();
    int MIN_VOLTAGE = 2;
    public static final int MAX_VOLTAGE = 18;
    public static final boolean DEADLY = true;
}
