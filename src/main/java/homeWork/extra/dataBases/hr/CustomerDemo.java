package homeWork.extra.dataBases.hr;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class CustomerDemo {
    public static void main(String[] args) {
        String q = "select * from customer";
        ConnectDB connectDB = new ConnectDB();
        Map<Integer,Customer> customers = new HashMap<>();
        int count = 1;

        try {
            Statement statement = connectDB.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(q);

            while (resultSet.next()){
                Customer customer = new Customer();
                customer.setId(resultSet.getInt(1));
                customer.setName(resultSet.getString(2));
                customer.setCity(resultSet.getString(3));
                customer.setRating(resultSet.getInt(4));
                customers.put(count,customer);
                count++;
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        for (Map.Entry<Integer,Customer> entry : customers.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
