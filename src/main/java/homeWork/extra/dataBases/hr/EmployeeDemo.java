package homeWork.extra.dataBases.hr;

import javaProStanislav.lesson05_22032023.arrayList.Person;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeDemo {
    public static void main(String[] args) {
        String q = "select * from employees";
        ConnectHR connectHR = new ConnectHR();
        Map<Integer, Employees> employees = new HashMap<>();
        int count = 1;
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
                employee.setDate(resultSet.getDate(6));
                employee.setJobId(resultSet.getString(7));
                employee.setSalary(resultSet.getDouble(8));
                employee.setCommission(resultSet.getDouble(9));
                employee.setManagerId(resultSet.getInt(10));
                employee.setDepartmentId(resultSet.getInt(11));
                employees.put(count, employee);
                count++;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        for (Map.Entry<Integer, Employees> entry : employees.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
