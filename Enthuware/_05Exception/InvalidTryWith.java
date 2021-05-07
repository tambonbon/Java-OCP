import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class InvalidTryWith {
    public static void main(String[] args) {
        Statement stmt = null;
        Connection c = DriverManager.getConnection("jdbc...", "app", "app");
        try (stmt = c.createStatement()) { // THIS IS WRONG
            
        } catch (Exception e) {
            //TODO: handle exception
        }

        try (Statement statement = c.createStatement()) { // THIS IS CORRECT 

        } catch (Exception e) {

        }
    }
}
