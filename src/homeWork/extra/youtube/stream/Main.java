package homeWork.extra.youtube.stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = Data.getPersons();
//        for (Person person : persons){
//            System.out.println(person);
//        }
//        List<Person> persons1 = persons.stream()
//                .filter(p -> p.getAge()>30)
//                .collect(Collectors.toList());
//        for (Person person : persons1){
//            System.out.println(person);
//        }
//        long count = persons.stream()
//                .filter(p ->p.getAge()>30)
//                .count();
//        System.out.println(count);
        persons.stream().forEach(p-> System.out.println(p));
    }
}
