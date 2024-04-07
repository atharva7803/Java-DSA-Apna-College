import java.util.Scanner;

public class quickSort {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int si, int ei) { // recursive function
        if (si >= ei) {
            return;
        }

        int pIdx = partition(arr, si, ei);   //pIdx(pivot index)
        quickSort(arr, si, pIdx-1);; // For left part of array
        quickSort(arr, pIdx+1, ei);; // For right part of array

    }


    // Partition function
    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1;  // to make place for elems smaller than pivot

        // for placing the elems in correct position using swap
        for(int j = si; j < ei; j++){
            if(arr[j] <= pivot){
                i++;   
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i]= temp;
            }
        }
        // For placing pivot index in right position
        i++;   
        // swap
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i]= temp;
        return i;   // it will return pivot index
    }
      

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array is:- ");
        printArray(arr);
    }
}

// OUTPUT:
// Sorted array is:- 
// 2 3 5 6 8 9 

// TC: O(nlogn) , SC: O(1)