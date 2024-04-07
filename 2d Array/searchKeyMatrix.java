// Question: To find a specific value in matrix

import java.util.Scanner;
public class searchKeyMatrix {

    public static boolean searchKeyMatrix(int matrix[][], int key){
        int row = 0, col = matrix[0].length-1;       // Starting from 40 (in matrix)

        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == key){
                System.out.println("Key found at cell: (" + row + "," + col + ")");
                return true;
            }
            else if(key < matrix[row][col]) {
                col--;    // Go Left
            }
            else{
                row++;    // Go Bottom
            }          
        }
        System.out.println("Key not found!");
        return false;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        int matrix[][] = {{10,20,30,40},
                          {15,25,35,45},
                          {27,29,37,48}, 
                          {32,33,39,50}};  
        int key = 33;

        searchKeyMatrix(matrix, key);
    }
}

// Output: Key found at cell: (3,1)