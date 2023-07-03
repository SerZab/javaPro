package javaProStanislav.lesson23_07062023.mockito2;

public class Employee {
    private String name;
    private String bankId;
    private int salary;

    public Employee(String name, String bankId, int salary) {
        this.name = name;
        this.bankId = bankId;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "name='" + name + '\'' +
                ", bankId='" + bankId + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getBankId() {
        return bankId;
    }

    public int getSalary() {
        return salary;
    }
}
