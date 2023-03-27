package lessons.lesson03_15032023;

public class TwoDimArray {
    public static void main(String[] args) {
        int[][] twoDimArray = new int [3][3];
        int count = 0;
        
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                count++;
                twoDimArray[i][j] = count;
                System.out.print(twoDimArray[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
