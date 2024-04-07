// Implementation of Counting Sort

import java.util.Scanner;
public class countingsort {

    public static void countingsort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];
        for(int i = 0 ; i < arr.length; i++){
            count[arr[i]]++;
        }

        // Sorting
        int j = 0;
        for(int i = 0 ; i < count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
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

        countingsort(arr);
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