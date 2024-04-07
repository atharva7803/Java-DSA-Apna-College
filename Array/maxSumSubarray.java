import java.util.Scanner;
public class maxSumSubarray {

    public static void maxSumSubarray(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;    // -infinity

        for(int i = 0; i < arr.length; i++){
            int start = i;
            for(int j = i; j < arr.length; j++){    // j = i for printing starting single element of array
                int end = j;
                currSum = 0;
                for(int k = start; k <= end; k++){
                    currSum = currSum + arr[k];
                }
                System.out.println("Sum: " + currSum);

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

        maxSumSubarray(num);
    }
}

/*
    Output: 
    Enter the size of array:
    5
    Enter 5 elements in array: 
    1 -2 6 -1 3
    Sum: 1
    Sum: -1
    Sum: 5
    Sum: 4
    Sum: 7

    Sum: -2
    Sum: 4
    Sum: 3
    Sum: 6

    Sum: 6
    Sum: 5
    Sum: 8

    Sum: -1
    Sum: 2

    Sum: 3

    Maximum Sum of subarrays is: 8

 */