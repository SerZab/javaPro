package homeWork.extra;

import java.util.Random;

public class Task12 {
    public static void main(String[] args) {
        int[] numbers = new int[3];

        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
            // генерация случайного числа от 0 до 10
            System.out.println("Index " + i + ": " + numbers[i]);
        }
    }
}
