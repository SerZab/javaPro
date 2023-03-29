package lessons.lesson07_29032023;

public class Main {
    public static void main(String[] args) {
        Developer developer = new Developer("Петр Петров", 30, 3500);
        QaSpecialist qaSpecialist = new QaSpecialist("Иван Иванов", 35, 3800);
        Manager manager = new Manager("Андрей Андреев", 38, 5000);

        developer.work(); // Я программирую
        qaSpecialist.work(); // Я проверяю функционал
        manager.work(); // Я управляю проектом
    }
}
abstract class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public abstract void work();
}
abstract class Employee extends Person {
    private int salary;

    public Employee(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public abstract void work();
}
class Developer extends Employee {
    public Developer(String name, int age, int salary) {
        super(name, age, salary);
    }

    @Override
    public void work() {
        System.out.println("Я программирую");
    }
}
class QaSpecialist extends Employee {
    public QaSpecialist(String name, int age, int salary) {
        super(name, age, salary);
    }

    @Override
    public void work() {
        System.out.println("Я проверяю функционал");
    }
}
class Manager extends Employee {
    public Manager(String name, int age, int salary) {
        super(name, age, salary);
    }

    @Override
    public void work() {
        System.out.println("Я управляю проектом");
    }
}
