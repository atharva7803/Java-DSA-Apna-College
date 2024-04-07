// Question: Spiral matrix

import java.util.Scanner;
public class spiralMatrix {

    public static void spiralMatrix(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while(startRow <= endRow && startCol <= endCol){
        // For top row
        for(int j = 0; j <= endCol; j++){    // j = columns
            System.out.print(matrix[startRow][j] + " ");
        }

        // For right most col
        for(int i =startRow + 1; i <= endRow; i++){    // i = rows , i = startRow + 1 bcz we had already print the first row element , now we have to print form second row (Notes)
            System.out.print(matrix[i][endCol] + " ");
        }

        // For bottom row
        for(int j = endCol - 1; j >= startCol; j--){
            if(startRow == endRow){
                break;
            }
            System.out.print(matrix[endRow][j]  + " ");
        }

        // For left most col
        for(int i = endRow - 1; i >= startRow + 1; i--){
            if(startCol == endCol){
                break;
            }
            System.out.print(matrix[i][startCol] + " ");
        }

        startRow++;
        endRow--;
        startCol++;
        endCol--;
    }
    System.out.println();
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

        spiralMatrix(matrix);
    }
}

// Output:
// Enter the number of rows: 4
// Enter the number of columns: 4
// Enter the element at row 1, column 1: 1
// Enter the element at row 1, column 2: 2
// Enter the element at row 1, column 3: 3
// Enter the element at row 1, column 4: 4
// Enter the element at row 2, column 1: 5
// Enter the element at row 2, column 2: 6
// Enter the element at row 2, column 3: 7
// Enter the element at row 2, column 4: 8
// Enter the element at row 3, column 1: 9
// Enter the element at row 3, column 2: 10
// Enter the element at row 3, column 3: 11
// Enter the element at row 3, column 4: 12
// Enter the element at row 4, column 1: 13
// Enter the element at row 4, column 2: 14
// Enter the element at row 4, column 3: 15
// Enter the element at row 4, column 4: 16

// 1 2 3 4 8 12 16 15 14 13 9 5 5 6 7 11 10