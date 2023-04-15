package homeWork.dataBases.hr;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CountriesDemo {
    public static void main(String[] args) {

        String q1 = "select * from countries";
        ConnectHR connectHR = new ConnectHR();
        try {
            Statement statement1 = connectHR.getConnection().createStatement();
            ResultSet resultSet1 = statement1.executeQuery(q1);

            while (resultSet1.next()){
                Countries country = new Countries();
                country.setId(resultSet1.getString(1));
                country.setName(resultSet1.getString(2));
                country.setRegId(resultSet1.getInt(3));
                System.out.println(country);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
