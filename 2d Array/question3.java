// Question 3 :Write a program to FindTransposeofa Matrix.What is Transpose?
// Transpose of a matrix is the process ofswapping therows to columns. 
// For a 2x3 matrix, Matrix    a11    a12    a13
//                             a21    a22    a23

//           Transposed Matrix a11    a21
//                             a12    a22
//                             a13    a23

import java.util.Scanner;
public class question3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        
        System.out.println("Enter the no. of rows: ");
        int rows = sc.nextInt();

        System.out.println("Enter the no. of cols: ");
        int cols = sc.nextInt();

        int matrix[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter the element at row " + (i+1) + ", column " + (j+1) + ": ");
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        int transpose[][] = new int[cols][rows];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("Transpose of the matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// Output:
// Enter the no. of rows: 
// 2
// Enter the no. of cols:
// 3
// Enter the element at row 1, column 1: 2
// Enter the element at row 1, column 2: 3
// Enter the element at row 1, column 3: 7

// Enter the element at row 2, column 1: 5 
// Enter the element at row 2, column 2: 6
// Enter the element at row 2, column 3: 7

// Transpose of the matrix:
// 2 5
// 3 6
// 7 7