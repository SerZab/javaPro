package homeWork.dataBases.hr;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDemo {
    public static void main(String[] args) {
        String q = "select * from employees";
        ConnectHR connectHR = new ConnectHR();
        try {
            Statement statement = connectHR.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(q);

            while (resultSet.next()){
                Employees employee = new Employees();
                employee.setEmployeeId(resultSet.getInt(1));
                employee.setFirstName(resultSet.getString(2));
                employee.setLastName(resultSet.getString(3));
                employee.setEmail(resultSet.getString(4));
                employee.setPhone(resultSet.getString(5));
                employee.setJobId(resultSet.getString(6));
                employee.setSalary(resultSet.getDouble(7));
                employee.setCommission(resultSet.getDouble(8));
                employee.setManagerId(resultSet.getInt(9));
                employee.setDepartmentId(resultSet.getInt(10));
                System.out.println(employee);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
