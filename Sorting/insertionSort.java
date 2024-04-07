// Implementation of Insertion Sort

import java.util.Scanner;
public class insertionSort {

    public static void insertionSort(int arr[]){
        for(int i = 0; i < arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            // To find the correct positon to insert
            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev+1] = curr;
        }        
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter "+ n +" Elements of array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        insertionSort(arr);
        System.out.println("Sorted array is: ");{
            for(int i = 0; i < n; i++){
                System.out.print(arr[i] + " ");
            }
        }
    }
}

// Output:
// Enter the size of array: 
// 5
// Enter 5 Elements of array: 
// 84 75 21 65 3
// Sorted array is: 
// 3 21 65 75 84