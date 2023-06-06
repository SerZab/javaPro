package practiceMihail.lesson17_13052023;

public class Task2 {
    public static void main(String[] args) {
        int[] arr1 = {1,3,7,23,45,100,-1200};
        int[] arr2 = {1,1,0,-1,-12,20};
        int[] arr3 = {1,1,1,1,1,1,1,1};
        System.out.println(checkArray(arr1));
        System.out.println(checkArray(arr2));
        System.out.println(checkArray(arr3));
    }
    public static boolean checkArray(int[] arr) {
        boolean incr = true;
        boolean mono = true;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i-1])  incr = false;

            if (arr[i] > arr[i-1])  mono = false;
        }
        return incr || mono;
    }
}
