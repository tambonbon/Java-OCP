package Chapter13.annotationSpecific.storingAnnotations;

/*
* Type erasure: discard certain types of info when converting code to .class file
* Similarly, annotations may be discarded by compiler or at runtime
* by using @Retention
* *RetentionPolicy.SOURCE*: used only in src file, discarded by compiler
* *RetentionPolicy.CLASS*: stored in .class file, but NOT available at RT
* *RetentionPolicy.RUNTIME*: stored in .class file, available at RT
* */

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
public @interface Flier {

}
