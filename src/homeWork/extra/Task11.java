package homeWork.extra;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Task11 {
    public static void main(String[] args) {
        int[] arr = IntStream.generate(() -> new Random().nextInt(100)).limit(25).toArray();
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(bubbleSort(arr)));
        System.out.println(Arrays.toString(insertSort(arr)));

//        int length = readArrayLength();
//        int[] array = createArray(length);
//        fillArray(array);
//        printArray(array);
    }

    private static int[] insertSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[min]>arr[j]) min = j;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    private static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        } return arr;
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
