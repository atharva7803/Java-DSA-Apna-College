// Implementation of Inbuilt Sort

import java.util.Arrays;      // We need to import Arrays
import java.util.*;      
public class inbuiltSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter "+ n +" Elements of array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        //Arrays.sort(arr);   // Inbuilt Sort
        Arrays.sort(arr,0,3);

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
// 8 5 1 3 2 
// Sorted array is: 
// 1 5 8 3 2           It will sort upto index 2