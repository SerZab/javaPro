package practiceMihail.lesson02_13032023;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 0, 4, 6, -2, 5, 7, -1, 8, 9, 11};
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                secondMin = min;
                min = numbers[i];
            } else if (numbers[i] < secondMin && numbers[i] != min) {
                secondMin = numbers[i];
            }
        }
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Второй после минимального элемент: " + secondMin);
    }
}
