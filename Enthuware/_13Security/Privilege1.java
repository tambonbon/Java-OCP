package Enthuware._13Security;

import java.security.AccessController;
import java.security.PrivilegedAction;

public class Privilege1 {
    public static String getOptions(final String propName) {
        return AccessController.doPrivileged(
            new PrivilegedAction<String>(){
                @Override
                public String run() {
                    return System.getProperty(propName);
                }
            }
        );
    }
    /* Remarks:
    1. It violates for invoking privileged actions 
    As per Guideline 9-3 / ACCESS-3:
    "Safely invoke java.security.AccessController.doPrivileged",
     the given code should retrieve a system property using a hardcoded value 
     instead of passing user input directly to the OS. 
     In the given code, the user can potentially wreck the application 
     by requesting illformated or mischievious property name. 
     Since the code is privileged, the call may cause unwanted impact directly on the OS.
     
    2. It violates for validating inputs
    Ideally, it should validate whether property name for which value is requested
     is valid or not (l.12)
     */
}
