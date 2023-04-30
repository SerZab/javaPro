package practiceMihail.lesson13_26042023;

import java.util.*;

public class Task {
    public static void main(String[] args) {
        // stream --> inter() --> termin()
//        int[] arr = {1,2,3,65,47,89};
//        long s = Arrays.stream(arr)
//                .map(el -> el*10)
//                .count();
//

        int[] arr = new int[10]; // создаем random массив
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(50); // генерируем
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("----------");
        System.out.println(duplicates(arr));
        System.out.println(duplicatesLamdba(arr));
        

    }
    public static boolean duplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr){
            set.add(i);
        }
        return set.size() != arr.length;
    }
    public static boolean duplicatesLamdba(int[] arr) {
        return Arrays.stream(arr).distinct().count() != arr.length;
    }
}
