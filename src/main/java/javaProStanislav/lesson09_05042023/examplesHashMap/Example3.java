package javaProStanislav.lesson09_05042023.examplesHashMap;

import java.util.HashMap;

/*
Первый элемент, встречающийся k раз в массиве
 */

public class Example3 {
    public static void main(String[] args) {
        int[] arr = new int[] {7,7,4,3,4,8,7};
        /*
        Из массива - найти первое число в массиве которое присутствует в массиве k раз
         */
        int k = 2; // сколько раз встречается
//        System.out.println("Answer is: number " + firstElement(arr, k));
        System.out.println("Answer is: number " + firstElementMoreEffective(arr, k));
    }

    public static int firstElement(int[] arr, int k) {

        // временная сложность O(n^2), т.к. цикл в цикле

        for (int i = 0; i < arr.length; i++) {
            // Count how many times selected element occurs
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    count++;
            }

            if (count == k)
                return arr[i];
        }

        return -1;
    }

    public static int firstElementMoreEffective(int[] arr, int k) {

        // Временная сложность: O(n)
        // Вспомогательное пространство: O(n), потому что мы используем вспомогательный массив размера n для хранения
        // счетчика

        HashMap<Integer, Integer> map = new HashMap<>();
        // ключ - элемент из массива
        // значением будет количество повторений этого числа
        // (сколько раз оно встречается в массиве)


        for (int i = 0; i < arr.length; i++) {

            int a = 0;

            if (map.get(arr[i]) != null)
                a = map.get(arr[i]);

            map.put(arr[i], a + 1);
        }

        System.out.println(map);

        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == k)
                return arr[i];
        }

        return -1;
    }

}
