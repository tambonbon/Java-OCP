package Enthuware._09JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeclareTryWithResrc {
    public static void main(String[] args) {
        // this declaration of try-with-resrc is WRONG!
        // because the Statement is declared before the use of try
        Statement stmt = null;
        Connection c = DriverManager.getConnection("jdbc:derby://local", "user", "password");
        try(stmt = c.createStatement()) { // invalid here
            
        }
    }
}
