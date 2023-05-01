package homeWork.extra.youtube.stream;

import java.util.ArrayList;
import java.util.List;

public class Data {
    private static List<Person> persons = new ArrayList<>();
    static {
        Person person1 = new Person("Ivan", "Ivanov", 33);
        Person person2 = new Person("Petr", "Petrov", 28);
        Person person3 = new Person("Sidor", "Sidorov", 39);
        Person person4 = new Person("Ivan", "Turgenev", 46);
        Person person5 = new Person("Lev", "Tolstoj", 300);
        Person person6 = new Person("Anton", "Chexov", 32);
        Person person7 = new Person("Afanasij", "Fet", 52);
        Person person8 = new Person("Vladimir", "Mayakovskij", 23);
        Person person9 = new Person("Mikhail", "Lermontov", 26);
        Person person10 = new Person("Alexej", "Tolstoj", 41);

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        persons.add(person6);
        persons.add(person7);
        persons.add(person8);
        persons.add(person9);
        persons.add(person10);
    }
    public static List<Person> getPersons() {
        return persons;
    }
}
