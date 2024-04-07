// Question: To find min and max value in matrix

import java.util.Scanner;

public class minMaxMatrix {

    public static int[] findMinMax(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int min = matrix[0][0];
        int max = matrix[0][0];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }

        int[] minMax = {min, max};
        return minMax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter the element at row " + (i+1) + ", column " + (j+1) + ": ");
                matrix[i][j] = sc.nextInt();
            }
        }

        int[] minMax = findMinMax(matrix);
        int min = minMax[0];
        int max = minMax[1];

        System.out.println("The smallest number in the matrix is " + min);
        System.out.println("The largest number in the matrix is " + max);
    }

}
