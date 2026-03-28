package Project_1;
import java.sql.*;

public class DB_Connection {
    # db.properties
    db.url=jdbc:mysql://localhost:3306/your_database_name
    db.username=your_db_username
    db.password=your_db_password
    public static Connection getConnection() throws Exception{
        return DriverManager.getConnection(url, username, password);
            }
}

