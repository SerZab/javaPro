package homeWork.extra;

import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        // создаем массив целых чисел длиной 3
        int[] array = new int[3];
        // создаем объект класса Random
        Random random = new Random();

        // заполняем каждую ячейку массива случайным целым числом
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);  // генерируем случайное число от 0 до 50
        }

        // выводим значение каждой ячейки на консоль
        for (int i = 0; i < array.length; i++) {
            System.out.println("Значение ячейки " + i + " равно " + array[i]);
        }
    }
}
