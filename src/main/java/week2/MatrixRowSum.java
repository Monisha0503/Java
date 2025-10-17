import java.util.Scanner;

public class MatrixRowSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        int[] rowSum = new int[3];

        System.out.println("Enter 3x3 matrix elements:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
                rowSum[i] += matrix[i][j];
            }
        }

        int maxSum = rowSum[0];
        int maxRow = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Sum of row " + i + " = " + rowSum[i]);
            if (rowSum[i] > maxSum) {
                maxSum = rowSum[i];
                maxRow = i;
            }
        }

        System.out.println("Row with highest sum: Row " + maxRow);
    }
}