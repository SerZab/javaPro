package homeWork.extra.dataBases.hr;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class ClientDemo {
    public static void main(String[] args) {
        String q = "select * from salespeople";
        ConnectH connectH = new ConnectH();

        Map<Integer,Client> map = new HashMap<>();
        int count = 1;

        try {
            Statement statement = connectH.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(q);

            while (resultSet.next()){
                Client client = new Client();
                client.setId(resultSet.getInt(1));
                client.setName(resultSet.getString(2));
                client.setCity(resultSet.getString(3));
                client.setRating(resultSet.getDouble(4));
                map.put(count,client);
                count++;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        for (Map.Entry<Integer,Client> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
