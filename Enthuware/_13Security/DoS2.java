package Enthuware._13Security;

import java.net.Socket;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.PrivilegedExceptionAction;

public class DoS2 {
    
    public void invokeService(String srvname, String host, int port) {
        Socket socket = null;
        try {
            AccessController.doPrivileged(PrivilegedExceptionAction<Void>) () ->
                socket = new Socket(host, port) ;
                return null;
        }
    }

    /* 
    Also you notice the following permission given to this code in the security policy file:
    */
    // permission java.io.SocketPermission "*", "connect";

    /** Problem:
     * DoS might occur against any reachable host ..
     * .. because letting socket connections to be opened to any host ..
     * .. has potential co cause DoS against that host !
     */
}
