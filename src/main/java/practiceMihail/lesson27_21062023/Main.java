package practiceMihail.lesson27_21062023;

public class Main {
    public static void main(String[] args) {
        int[][] array = {
                {1, 5, 6, 8, 20},
                {2, 7, 9, 11, 30},
                {4, 9, 14, 18, 40},
                {5, 16, 22, 25, 50},
                {8, 19, 24, 29, 60}
        };

        System.out.println(findElement(array, 16));
    }

    public static boolean findElement(int[][] array, int target) {

        // Обход двухмерного массива
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
