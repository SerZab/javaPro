package homeWork.extra.youtube.stream;

import java.util.Arrays;
import java.util.List;

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

        int number = 123456789;
        int[] arr = Integer.toString(number)
                .chars()
                .map(Character::getNumericValue)
                .toArray();
        System.out.println(Arrays.toString(arr));
        int num = Arrays.stream(arr)
                .reduce(0,(n,m)->n=n*10+m);
        System.out.println(num);
    }
}
