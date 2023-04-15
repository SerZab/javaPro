package homeWork.dataBases;

import java.sql.*;

public class Main {
    private static final String URL = "jdbc:mysql://localhost:3306/test_db";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "1Iwltbr1";
    
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            if (!connection.isClosed()) {
                System.out.println("We are connected!");
            }
            Statement statement = connection.createStatement();
//            statement.execute("INSERT INTO animal (animal_name, animal_desc) VALUES ('Tuzik','discription2')");
//            statement.executeUpdate("UPDATE animal SET animal_name='Charlik' where id=1;");
//            statement.addBatch("INSERT INTO animal (animal_name, animal_desc) VALUES ('Bobik1','discription3')");
//            statement.addBatch("INSERT INTO animal (animal_name, animal_desc) VALUES ('Bobik2','discription4')");
//            statement.addBatch("INSERT INTO animal (animal_name, animal_desc) VALUES ('Bobik3','discription5')");
//            statement.executeBatch();
//            statement.clearBatch();
        } catch (SQLException e) {
            System.out.println("there is no connection... Exception!");
        }
    }
}
