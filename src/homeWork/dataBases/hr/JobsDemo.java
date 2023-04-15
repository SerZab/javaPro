package homeWork.dataBases.hr;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JobsDemo {
    public static void main(String[] args) {
        String q = "select * from jobs";
        ConnectHR connectHR = new ConnectHR();
        try {
            Statement statement = connectHR.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(q);

            while (resultSet.next()){
                Jobs jobs = new Jobs();
                jobs.setJobId(resultSet.getString(1));
                jobs.setTitle(resultSet.getString(2));
                jobs.setMinSalary(resultSet.getInt(3));
                jobs.setMaxSalary(resultSet.getInt(4));
                System.out.println(jobs);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
