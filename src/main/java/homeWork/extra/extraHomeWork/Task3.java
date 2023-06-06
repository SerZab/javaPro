package homeWork.extra.extraHomeWork;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        // Создание списка
        List<Integer> numbers = new ArrayList<>();
        int elem = 10;
        // Добавление элементов начиная со второго
        for (int i = 2; i <= elem; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);
        System.out.println("------------------------");

        // Добавление элемента в начало списка
        numbers.add(0, 1);
        System.out.println(numbers);
        System.out.println("------------------------");

        // Добавление элементов в конец списка
        numbers.add(11);
        System.out.println(numbers);
        System.out.println("------------------------");

        // Узнать длину списка
        int size = numbers.size();
        System.out.println("Длина списка: " + size);

        // Удаление элемента по индексу (6, удалит 7)
        numbers.remove(6);
        System.out.println(numbers);
        System.out.println("------------------------");

        // Удаление элемента без указания индекса (10)
        numbers.remove(Integer.valueOf(10));
        System.out.println(numbers);
        System.out.println("------------------------");

        // Проверка, является ли список пустым
        boolean isEmpty = numbers.isEmpty();
        System.out.println("Список пустой: " + isEmpty);

        // Обход списка и вывод элементов на консоль
        System.out.println("Элементы списка:");
        for (int elem1 : numbers) {
            System.out.println(elem1);
        }
    }
}
