package Chapter13.annotationSpecific.supportingDuplicates;
/**
 * @Repeatable is used when you want to specify an annotation more than ONCE on a type
 * or, assign an annotation with different value
*/
public class Zoo {
    public static class Monkey {}

    @Risk(danger = "Silly")
    @Risk(danger = "Aggressive", level = 5)
    private Monkey monkey;
}
