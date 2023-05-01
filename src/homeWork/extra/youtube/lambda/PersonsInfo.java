package homeWork.extra.youtube.lambda;

import java.util.ArrayList;
import java.util.List;

public class PersonsInfo {
    private static List<Person> people = new ArrayList<>();
    static {
        Person person1 = new Person("Vasya", "Vasiliev", 25);
        Person person2 = new Person("Petya", "Petrov", 35);
        Person person3 = new Person("Andrej", "Andreev", 45);
        Person person4 = new Person("Sidor", "Sidorov", 18);
        Person person5 = new Person("Katya", "Katerinova", 35);
        Person person6 = new Person("Anna", "Anaeva", 41);
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        people.add(person6);
    }

    public static List<Person> getPeople() {
        return people;
    }
}
