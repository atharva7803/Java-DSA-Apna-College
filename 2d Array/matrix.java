// Implementation of Matrix

import java.util.Scanner;
public class matrix  {

    public static boolean search(int matrix[][], int key){      // To find the key
        for(int i = 0; i < matrix.length; i++){     // For rows
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("Element found at cell (" + i + "," + j + ")");
                    return true;
                }
            }
        } 
        System.out.println("Element not found!");
        return false;
    }


    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        int matrix[][] = new int[3][3];
        int n = matrix.length;     // n = rows , so matrix length will be total rows
        int m = matrix[0].length;     // m = columns , [0] means first rows total columns which will give total columns of matrix

        System.out.println("Enter 9 elements of matrix: ");
        for(int i = 0; i < n; i++){     // For rows
            for(int j = 0; j < m; j++){     // For columns
                matrix[i][j] = sc.nextInt();
            }
        } 

        System.out.println("The matrix is: ");
        for(int i = 0; i < n; i++){     // For rows
            for(int j = 0; j < m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        } 
        search(matrix, 5);
    }
}


// Output:
// Enter 9 elements of matrix: 
// 1 2 3 4 5 6 7 8 9
// The matrix is:
// 1 2 3 
// 4 5 6
// 7 8 9
// Element found at cell (1,1)