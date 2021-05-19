package Enthuware._13Security;

import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.PrivilegedAction;

public class PermissionCallbackHandler {
    /* 
    The single argument doPrivileged checks AccessControlContext of current thread
    Sice the call back handler will be invoked by the system ..
    .. the current thread will be a system thread.
    Thus, the call back handler will be executed with permission of system thread
                                    ^^^^^^^^^^^ --> NOT WHAT WE WANT
     */
    static class NotProtectedCallbackHandler implements Runnable {
        final String action;
        public NotProtectedCallbackHandler(String action) {
            this.action = action;
        }
        public void run() {
            AccessController.doPrivileged(
                new PrivilegedAction<Void>(){
                    public Void run() {
                        // Do sensity ops
                        return null;
                    }
                }
            );
        }
    }

    /* 
    To check permission of user, we need to store AccessControlContext of the user thread ..
    .. who registered the handler at the time of creation of the handler
     */
    static class ProtectedCallbackHandler implements Runnable {
        final String action;
        final AccessControlContext access; // <--- store the accesscontrolcontext of the creator
        public ProtectedCallbackHandler(String action, AccessControlContext acc) throws SecurityException {
            if (acc == null) { // check whether be done to ensure user permission is checked
                throw new SecurityException("Missing AccessControlContext");
            }
            this.action = action;
            this.access = access;
        }

        @Override
        public void run() {
            AccessController.doPrivileged(
                new PrivilegedAction<Void>(){
                    public Void run() {
                        // Do sensity ops
                        return null;
                    }
                }, access
            );
        }
    }
}
