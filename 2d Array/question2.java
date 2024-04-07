// Question 2 :Print out the sum of the numbers in  the second row of the “nums” array.
// Example :Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
// Output - 18

import java.util.Scanner;
public class question2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        int[][] matrix = { {1,4,9},{11,4,3},{2,2,3} };
        int sum = 0;
        
        for(int j = 0; j < matrix[0].length; j++){
            sum += matrix[1][j];
        }

        System.out.println("The sum of 2nd row of matrix is: " + sum);
    }
}

// Output: The sum of 2nd row of matrix is: 18