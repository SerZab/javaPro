package practiceMihail.lesson14_03052023;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Tasks {
    public static void main(String[] args) {

        // Найти среднее арифметическое всех элементов массива.
        int[] arr = {1, 2, 3, 4, 5};
        double avg = Arrays.stream(arr)
                .average()
                .orElse(0.0);
        System.out.println(avg);

        // Найти максимальный элемент в списке строк, длина которых больше 5 символов.
        List<String> list = Arrays.asList("apple", "banana", "pear", "orange", "grapefruit");

        System.out.println(list.stream()
                .filter(s -> s.length() > 5)
                .sorted(Comparator.reverseOrder())
                .findFirst());

        // Найти первый элемент списка, который начинается с буквы "A",
        // или вернуть пустой Optional, если такого элемента нет.
        List<String> list1 = Arrays.asList("apple", "banana", "apricot", "orange", "avocado");

        System.out.println(list1.stream()
                .filter(s -> s.startsWith("a"))
                .findFirst());

        // Найти сумму квадратов всех четных чисел в массиве
        int[] arr1 = {1, 2, 3, 4, 5};
        int sum = Arrays.stream(arr1)
                .filter(n -> n % 2 == 0)
                .map(n -> n*n)
                .sum();
        System.out.println(sum);

        //Получить все уникальные слова из списка строк, отсортированные в алфавитном порядке.
        List<String> list2 = Arrays.asList("apple", "banana", "orange", "pear", "orange", "apple");
        System.out.println(list2.stream()
                .distinct()
                .sorted()
                .toList());
    }
}
