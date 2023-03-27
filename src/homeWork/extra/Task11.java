package homeWork.extra;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {

        int length = readArrayLength();
        int[] array = createArray(length);
        fillArray(array);
        printArray(array);
    }

    private static int readArrayLength() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        return scanner.nextInt();
    }

    private static int[] createArray(int length) {
        return new int[length];
    }

    private static void fillArray(int[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите число для ячейки " + i + ": ");
            array[i] = scanner.nextInt();
        }
    }
    
    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Значение ячейки " + i + " равно " + array[i]);
        }
    }
}
