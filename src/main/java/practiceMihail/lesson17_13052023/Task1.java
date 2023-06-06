package practiceMihail.lesson17_13052023;

public class Task1 {
    public static void main(String[] args) {
        int[][] A = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("---------");

        int[][] B = rotate(A);
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static int [][] rotate(int[][] A) {
        int[][] B = new int[A[0].length][A.length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                B[j][A.length-i-1] = A[i][j];
            }
        }
        return B;
    }
}
