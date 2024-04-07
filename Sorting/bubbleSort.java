// Implementation of Bubble Sort

import java.util.Scanner;
public class bubbleSort {

    // public static void bubbleSort(int arr[]){              TC: best case & worst case = O(n2)
    //     for(int turn = 0; turn < arr.length; turn++){
    //         int swap = 0;
    //         for(int j = 0; j < arr.length - 1; j++){
    //             if(arr[j] > arr[j+1]){
    //                 int temp = arr[j];
    //                 arr[j] = arr[j+1];
    //                 arr[j+1] = temp;
    //             }
    //             swap++;
    //             if(swap == 0){
    //                 System.out.println("Array is already sorted!");
    //             }
    //         }
            
    //     }
    // }

    public static void modifiedbubbleSort(int arr[]){          // TC: Worst Case = O(n2)  Best Case = O(n)
        for(int turn = 0; turn < arr.length; turn++){
            boolean swap = false;
            for(int j = 0; j < arr.length - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if(swap == false){
                System.out.println("Array is already sorted!");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        modifiedbubbleSort(arr);
        
        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}