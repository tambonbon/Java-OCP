package Chapter13.annotationSpecific.limitUsage;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/*
* TYPE_USE can be used anywhere there is a Java type
* including nearly all values in T.13.1
* BUT, can only be used in methods returning a value (no void method)
* */
@Target(ElementType.TYPE_USE)
public @interface Technical {
}
