package practiceMihail.lesson08_03042023.equalsHashcode;

import lombok.AllArgsConstructor;

import java.util.Objects;

@AllArgsConstructor
public class Person {

    private String name;
    private String surname;
    private int age;
    private double salary;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Double.compare(person.salary, salary) == 0 && Objects.equals(name, person.name) && Objects.equals(surname, person.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, salary);
    }

    public static void main(String[] args) {
        Person p1 = new Person("T", "R", 25, 1000);
        Person p2 = new Person("T", "R", 25, 1000);

        System.out.println(p1.hashCode() == p2.hashCode());
        System.out.println(p1.equals(p2));
        System.out.println(p1 == p2);
    }
}