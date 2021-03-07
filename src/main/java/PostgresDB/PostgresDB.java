package PostgresDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresDB implements IDB{
    Connection con= null;
    String connectionURL = "jdbc:postgresql://localhost:5432/postgres";
    @Override
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        try{
            Class.forName("org.postgresql.Driver");
             con= DriverManager.getConnection(connectionURL,"postgres","Alisher31102002");
             return con;
        } catch (Exception e){e.printStackTrace(); return  null;}
        finally {
            System.out.println("Operation proceeded");
        }
    }
}
