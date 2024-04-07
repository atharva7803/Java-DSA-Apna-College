// Implementation of Maximum Sum of subarrays

import java.util.Scanner;
public class maxSumPrefixArray {

    public static void maxSumPrefixArray(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;    // -infinity

        int prefix[] = new int[arr.length];   // Prefix array

        // To calculate prefix array
        prefix[0] = arr[0];    // First no. is same as normal array
        for(int i = 1; i < prefix.length; i++){
            prefix[i] = prefix[i-1] + arr[i];   // Previous element of prefix array + next no. of normal array
        }

        for(int i = 0; i < arr.length; i++){
            int start = i;
            for(int j = i; j < arr.length; j++){    // j = i for printing starting single element of array
                int end = j;

                if(start == 0){     // when start = 0 , For prefix[start - 1] so it cant be -ve
                    currSum = prefix[end];
                }
                else{
                    currSum = prefix[end] - prefix[start - 1];
                }


                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
            System.out.println();
        }
        System.out.println("Maximum Sum of subarrays is: " + maxSum);
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

        maxSumPrefixArray(num);
    }
}

/*
    Output: 
    Enter the size of array:
    5
    Enter 5 elements in array: 
    1 -2 6 -1 3

    Maximum Sum of subarrays is: 8

 */