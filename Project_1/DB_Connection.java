package Project_1;
import java.sql.*;

public class DB_Connection {
    private static final String url ="jdbc:mysql://localhost:3306/NAGESHM";
    private static final String username = "root";
    private static final String password = "Nagu7619353357";
    public static Connection getConnection() throws Exception{
        return DriverManager.getConnection(url, username, password);
            }
}

