package homeWork.extra.youtube.lambda;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = PersonsInfo.getPeople();
        List<Person> people1 = people.stream()
                        .map(person -> new Person(person.getName(), person.getLastname(), person.getAge()+30))
                .filter(person->person.getAge()>50)
                .collect(Collectors.toList());
        people1.forEach(person -> System.out.println(person));

    }
}
