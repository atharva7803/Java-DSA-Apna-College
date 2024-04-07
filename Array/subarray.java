// Implementation to print subarray

import java.util.Scanner;
public class subarray {

    public static void subarray(int arr[]){
        int ts = 0;    // Total Subarray
        for(int i = 0; i < arr.length; i++){
            int start = i;
            for(int j = i; j < arr.length; j++){    // j = i for printing starting single element of array
                int end = j;
                for(int k = start; k <= end; k++){
                    System.out.print(arr[k] + " ");   // It will print subarray
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarray are: " + ts);
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

        subarray(num);
    }
}

/*
    Output: 
    Enter the size of array: 
    5
    Enter 5 elements in array:
    2 4 6 8 10

    2
    2 4
    2 4 6
    2 4 6 8
    2 4 6 8 10

    4
    4 6
    4 6 8
    4 6 8 10

    6
    6 8
    6 8 10

    8
    8 10

    10

    Total Subarray are: 15

 */