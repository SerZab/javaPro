package homeWork.extra.dataBases.hr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
    private static final String URL = "jdbc:mysql://localhost:3306/shop";
    private static final String LOGIN = "root";
    private static final String PASS = "1Iwltbr1";
    private Connection connection;

    public ConnectDB() {
        try {
            connection = DriverManager.getConnection(URL,LOGIN,PASS);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
