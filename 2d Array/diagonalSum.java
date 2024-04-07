// Question: Diagonal Sum

import java.util.Scanner;
public class diagonalSum {

    public static int diagonalSum(int matrix[][]){    // T.C : O(n2)
        int sum = 0;

        // for(int i = 0; i < matrix.length; i++){
        //     for(int j = 0; j < matrix[0].length; j++){
        //         // For primary diagonal
        //         if(i == j){
        //             sum += matrix[i][j];
        //         }
        //         // For secondary diagonal
        //         else if(i+j == matrix.length-1){
        //             sum += matrix[i][j];
        //         }
        //     }
        // }

        // 2nd method   T.C = O(n)
        for(int i = 0; i < matrix.length; i++){
            // Pd
            sum += matrix[i][i];
            // Sd
            if(i != matrix.length-1-i){               // j = matrix.length-1-i
                sum += matrix[i][matrix.length-1-i];
            }
        }

        return sum;
    }


    

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the no. of rows: ");
        int row = sc.nextInt();

        System.out.println("Enter the no. of columns: ");
        int col = sc.nextInt();

        int matrix[][] = new int[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0 ; j < col; j++){
                System.out.print("Enter the element at row " + (i+1) + ",column " + (j+1) + ": ");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The sum of diagonls are: " + diagonalSum(matrix));
    }
}


// Output:
// Enter the no. of rows: 
// 4
// Enter the no. of columns: 
// 4
// Enter the element at row 1,column1: 
// 1
// Enter the element at row 1,column2: 
// 2
// Enter the element at row 1,column3: 
// 3
// Enter the element at row 1,column4: 
// 4
// Enter the element at row 2,column1:
// 5
// Enter the element at row 2,column2:
// 6
// Enter the element at row 2,column3:
// 7
// Enter the element at row 2,column4:
// 8
// Enter the element at row 3,column1:
// 9
// Enter the element at row 3,column2:
// 10
// Enter the element at row 3,column3:
// 11
// Enter the element at row 3,column4:
// 12
// Enter the element at row 4,column1:
// 13
// Enter the element at row 4,column2:
// 14
// Enter the element at row 4,column3:
// 15
// Enter the element at row 4,column4:
// 16
// 68