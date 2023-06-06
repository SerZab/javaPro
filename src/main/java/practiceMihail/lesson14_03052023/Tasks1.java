package practiceMihail.lesson14_03052023;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Tasks1 {
    public static void main(String[] args) {
        // Дан список целых чисел. Напишите программу, которая вычисляет сумму нечетных чисел в списке.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = numbers.stream()
                .filter(number -> number % 2 != 0)
//                .mapToInt(Integer::intValue)
//                .sum();
        .reduce((n1,n2)->n1+n2).get();
            System.out.println(sum);

        // Дан список строк. Напишите программу, которая находит самую длинную строку в списке.
        List<String> strings = Arrays.asList("Java", "Python", "C++", "Ruby", "JavaScript", "PHP");
            System.out.println(strings.stream()
                    .max(Comparator.comparingInt(String::length))
                    .orElse(null));

        // Дан список объектов класса Person, у которых есть поля name и age. Напишите программу, которая находит все людей
        // старше 25 лет и сортирует их по имени в алфавитном порядке.

        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 20),
                new Person("Charlie", 25),
                new Person("David", 35),
                new Person("Eve", 28));

        System.out.println(people.stream()
                .filter(person -> person.age > 25)
                .sorted(Comparator.comparing(Person::toString))
                .toList());

        // Дан список целых чисел. Напишите программу, которая находит максимальный элемент в списке и умножает его на 2.
        List<Integer> numbers1 = Arrays.asList(1, 5, 10, 15, 20);
        System.out.println(numbers1.stream()
                .max(Integer::compareTo)
                .map(s->s*s)
                .get());

        // Дан список строк. Напишите программу, которая находит все строки, которые начинаются с буквы "J" и заканчиваются
        // на букву "a", и выводит их в консоль.
        List<String> strings1 = Arrays.asList("Java", "JavaScript", "Python", "Ruby", "JavaFX", "Scala");
        strings1.stream()
                .filter(s -> s.startsWith("J") && s.endsWith("a"))
                .forEach(System.out::println);
    }
}
@AllArgsConstructor
@ToString
class Person{
    String name;
    int age;
}
