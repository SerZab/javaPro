package homeWork.extra.dataBases;

import java.sql.*;

public class DBWorker {
    private static final String HOST = "jdbc:postgresql://localhost:5432/mydb";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "1Iwltbr1";
    private Connection connection;

    public DBWorker() {
        try {
            connection = DriverManager.getConnection(HOST,USERNAME,PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
    