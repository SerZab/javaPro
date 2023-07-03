package practiceMihail.lesson13_26042023;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.*;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        /**
         * - Фильтрация списка на нечетные числа
         * - Определение максимального значения в списке
         * - Получение среднего значения списка целых чисел
         * - Нахождение суммы чисел, кратных 3 и 5, из списка чисел
         * - Поиск наибольшей длины последовательности из уникальных чисел в списке
         *
         * List<String> strings = Arrays.asList("1", "2", "3", "4", "5");
         * - Преобразование списка строк в список чисел
         *
         * List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi");
         * - Фильтрация списка строк на те, которые начинаются с 'a' и преобразование их в верхний регистр
         * - Получение списка уникальных слов из списка строк, длина которых больше 4 символов
         *
         * List<Persons> people = Arrays.asList(new Persons("John", 25), new Persons("Alice", 22), new Persons("Bob", 30));
         * List<String> names = people.stream()
         * - Преобразование списка объектов класса в список их имен, отсортированных по возрасту
         */

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7, 8, 9, 10);
        // Фильтрация списка на нечетные числа
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if(i % 2 !=0){
               temp.add(i);
            }}
        System.out.println(temp);

        List<Integer> numbers1 = numbers.stream().filter(i -> i % 2 !=0)
                .collect(Collectors.toList());
        System.out.println(numbers1);
        System.out.println("--------");

        // Определение максимального значения в списке
        int max1 = numbers.stream().mapToInt(Integer::intValue).max().getAsInt();
        System.out.println(max1);
        System.out.println("--------");

        // Получение среднего значения списка целых чисел
        double avg = numbers.stream()
                .mapToInt(Integer::intValue)
                .average().getAsDouble();
        System.out.println(avg);
        System.out.println("--------");

        // Нахождение суммы чисел, кратных 3 и 5, из списка чисел
        int sum35 = numbers.stream().filter(q -> q % 3 == 0 || q % 5== 0).mapToInt(Integer::intValue).sum();
        System.out.println(sum35);
        System.out.println("--------");

        // Поиск наибольшей длины последовательности из уникальных чисел в списке


    }
}
@AllArgsConstructor
@Setter
@Getter
@ToString
class Person {
    private String name;
    private int age;
}
