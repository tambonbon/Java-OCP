package Chapter13.annotationSpecific.supportingDuplicates;

/** 
 * Containing annotation type: ANOTHER annotation defining a value() array element
 * usage: to use @Repeatable in the contained annotation
*/
public @interface Risks {
    Risk[] value(); // MUST named value(), which is a primitive array of 
                    // repeatable annotation type
}
