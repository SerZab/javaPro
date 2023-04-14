package homeWork.extraHomeWork.schoolManagementSystem;

public class Teacher {
    private static int nextId = 1;
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    public Teacher(String name, int salary) {
        this.id = nextId++;
        this.name = name;
        this.salary = salary;
        this.salaryEarned=0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
    public void receiveSalary(int salary){
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }
}
