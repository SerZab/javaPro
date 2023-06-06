package homeWork.extra.extraHomeWork;

import java.util.*;

public class Task2 {
    //Что может хранить java.util.List: примитивные типы данных или ссылки на объекты,
    //или то и другое? Напишите программу, в которой кодом продемонстрируйте ответ на вопрос.
    public static void main(String[] args) {

        // Простой лист
        List<Integer> list = new ArrayList<>();
        // Добавление элементов в список
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(Integer.valueOf(4));

        System.out.println("Список List на примитивные : " + list);
        System.out.println("--------------------------");

        // Обьекты
        List<Person> personList = new ArrayList<>();
        // Добавление объектов в список
        personList.add(new Person("Иван", "Иванов", "Java developer",25, 5000));
        personList.add(new Person("Василий", "Василиев", "FrontEnd", 30, 4500));
        personList.add(new Person("Андрей", "Андреев", "QA tester", 40, 4000));
        // Вывод списка на экран
        for (Person p : personList){
            System.out.println(p);
        }
    }
}
class Person {
    private String name;
    private String surname;
    private String profession;
    private int age;
    private double salary;

    public Person(String name, String surname, String profession, int age, double salary) {
        this.name = name;
        this.surname = surname;
        this.profession = profession;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Double.compare(person.salary, salary) == 0 && Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(profession, person.profession);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, profession, age, salary);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", profession='" + profession + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
