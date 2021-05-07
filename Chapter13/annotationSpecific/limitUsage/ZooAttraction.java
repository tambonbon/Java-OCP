package Chapter13.annotationSpecific.limitUsage;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
/*
* Limit the types
* that annotations can access to
*  */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
public @interface ZooAttraction {
}
