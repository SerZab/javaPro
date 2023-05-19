package homeWork.extra.dataBases;

import java.sql.*;

public class Main {
    private static final String URL = "jdbc:mysql://localhost:3306/test_db";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "1Iwltbr1";
    private static final String INSERT_NEW = "insert into dish values (?,?,?,?,?,?,?)";
    private static final String GET_ALL = "select * from dish";
    private static final String DELETE = "delete from dish where id = ?";
    
    public static void main(String[] args) {
//        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
//            if (!connection.isClosed()) {
//                System.out.println("We are connected!");
//            }
//            Statement statement = connection.createStatement();
//            statement.execute("INSERT INTO animal (animal_name, animal_desc) VALUES ('Tuzik','discription2')");
//            statement.executeUpdate("UPDATE animal SET animal_name='Charlik' where id=1;");
//            statement.addBatch("INSERT INTO animal (animal_name, animal_desc) VALUES ('Bobik1','discription3')");
//            statement.addBatch("INSERT INTO animal (animal_name, animal_desc) VALUES ('Bobik2','discription4')");
//            statement.addBatch("INSERT INTO animal (animal_name, animal_desc) VALUES ('Bobik3','discription5')");
//            statement.executeBatch();
//            statement.clearBatch();
//        } catch (SQLException e) {
//            System.out.println("there is no connection... Exception!");
//        }
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            preparedStatement = connection.prepareStatement(DELETE);
            preparedStatement.setInt(1,2);
            preparedStatement.executeUpdate();
//            preparedStatement = connection.prepareStatement(GET_ALL);
//            preparedStatement.setInt(1,2);
//            preparedStatement.setString(2,"Inserted title");
//            preparedStatement.setString(3,"Inserted description");
//            preparedStatement.setFloat(4,0.2f);
//            preparedStatement.setBoolean(5, true);
//            preparedStatement.setDate(6, new Date(Calendar.getInstance().getTimeInMillis()));
//            preparedStatement.setBlob(7, new FileInputStream("smile.png"));
//
//            preparedStatement.execute();
//            ResultSet res = preparedStatement.executeQuery();
//
//            while (res.next()){
//                int id = res.getInt("id");
//                String title = res.getString("title");
//                String desc = res.getString("description");
//                float rating = res.getFloat("rating");
//                boolean published = res.getBoolean("published");
//                Date date = res.getDate("created");
//                byte[] icon = res.getBytes("icon");
//                System.out.println("id: "+id+", title: "+title+", description: "+desc+", rating: "+rating+
//                        ", published: "+published+", date: "+date+", icon: "+icon.length);
//            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
