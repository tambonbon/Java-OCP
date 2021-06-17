package Enthuware._09JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QueryNoException {
    public static void main(String[] args) {
        Statement stmt = null;
        try(Connection c = DriverManager.getConnection(
            "jdbc:derby://localhost:1527/sample", 
            "app", 
            "app")) {
                stmt = c.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM STUDENT");
                while (rs.next()) { 
                    System.out.println(rs.getString(1));
                }
            } catch (SQLException exception) {
                System.out.println(exception);
            }
    }
    /**
     * 1. Once a Connection object is closed, you CANT access any subsequent objects..
     * .. i.e. Statement or ResultSet retrieved from that Connection
     * 2. References declared in try block (c and rs) are NOT visible outside try catch
     * 3. When a resrc is closed in in try-with-resrc block (c)..
     * .. it's closed at the end of try block irrespective whether
     */
}
