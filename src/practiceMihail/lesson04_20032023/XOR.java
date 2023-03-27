package practiceMihail.lesson04_20032023;

public class XOR {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 5, 3, 1};
        int[] arr1 = {1, 3, 5, 7, 9, 7, 5, 3, 1};
        int x = getSingle(arr);
        System.out.println(x);

        int y = getSingle1(arr1);
        System.out.println(y);
    }
    public static int getSingle(int[] array){
        int searchNum = 0;
        for (int j : array) {
            searchNum = searchNum ^ j;
        } return searchNum;
    }
    public static int getSingle1(int[] array){
        int searchNum = 0;
        for (int j : array) {
            searchNum = searchNum ^ j;
        } return searchNum;
    }
}
