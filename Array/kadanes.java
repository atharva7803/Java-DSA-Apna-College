// Max Subarray Sum (Kadanes)

import java.util.Scanner;
public class kadanes {

    public static void kadanes(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            currSum = currSum + arr[i];
            if(currSum < 0){
                currSum = 0;
            }

            // if(arr[i] < 0){                          When all the elements are negative
            //     maxSum = Math.max(maxSum, currSum);
            // }

            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println();
        System.out.println("Maximum Sum is: " + maxSum);
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int num[] = new int[n];
        System.out.println("Enter " + n + " elements in array: ");
        for(int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }

        kadanes(num);
    
    }
}