// Question 1 :Print the number of 7’s that are inthe 2d array.
// Example :Input - int[][] array = { {4,7,8},{8,8,7} };
// Output - 2

import java.util.Scanner;
public class question1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        int matrix[][] = {{4,7,8},
                          {8,8,7}}; 

        int countOf7 = 0;

        for(int i=0; i < matrix.length; i++) {
            for(int j=0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 7) {
                    countOf7++;
                }
            }
        }
        System.out.println("The count of 7 is: " + countOf7);
    }
}