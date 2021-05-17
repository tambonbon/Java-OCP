package Chapter21;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.List;

public class Privileged1 {
    /**
     * When executing a privileged action, it is important to ensure that..
     * .. only minimum access is granted!
     * ---> principle of least privilege <---
     * 
      */
    private static final String KEY = "secret.option";
    public String getSecret() {
        return AccessController.doPrivileged(
            new PrivilegedAction<String>(){
                @Override
                public String run() {
                    return System.getProperty(KEY);
                }
            }
        );
    }

    // this method, the caller is able to specify which value they want to read
    // ---> bad practice
    // MUST ENSURE Principle of Least Privilege
    public String getPoorSecret(String magicWord) {
        return AccessController.doPrivileged(
            new PrivilegedAction<String>(){
                @Override
                public String run() {
                    return System.getProperty(magicWord); // DON'T DO THIS !!!
                }
            }
        );
    }

    // Don't expose sensitive information
    private final List<Integer> codes = null;
    // even codes is final, the content can still be modified after doPrivileged() is complete
    // a safer option is to return an immutable copy of the list ..
    // .. like Collections.unmodifiableList(codes)
    public List<Integer> getExposedSecret() {
        return AccessController.doPrivileged(
            new PrivilegedAction<List<Integer>>(){
                public List<Integer> run() {
                    return codes;
                    // return Collections.unmodifiableList(codes);
                }
            }
        );
    }

    // Don't elevate permissions
    
}
