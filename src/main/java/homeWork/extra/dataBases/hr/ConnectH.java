package homeWork.extra.dataBases.hr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectH {
    private static final String LINK = "jdbc:mysql://localhost:3306/home";
    private static final String USR = "root";
    private static final String PASS = "1Iwltbr1";
    private Connection connection;

    public ConnectH() {
        try {
            connection = DriverManager.getConnection(LINK,USR,PASS);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
