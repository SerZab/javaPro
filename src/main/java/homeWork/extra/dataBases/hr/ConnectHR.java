package homeWork.extra.dataBases.hr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectHR {
    private static final String URL = "jdbc:mysql://localhost:3306/hr";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "1Iwltbr1";
    private Connection connection;

    public ConnectHR (){
        try {
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public Connection getConnection(){
        return connection;
    }
}
