import java.util.Scanner;

public class mergeSort {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int si, int ei) { // recursive function
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2; // or mid = (si+ei)/2
        mergeSort(arr, si, mid); // For left part of array
        mergeSort(arr, mid + 1, ei); // For right part of array

        merge(arr, si, ei, mid); // For merging the final array
    }
    

    // Merge sort function
    public static void merge(int arr[], int si, int ei, int mid) {
        int temp[] = new int[ei - si + 1]; // left(0,2)= 3 elem , right(3,5)= 3 elem  => 5-0+1 = 6 elem in total
        int i = si; // Iterator for left part of arr
        int j = mid + 1; // Iterator for left part of arr
        int k = 0; // Iterator for empty temp arr

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // For remaining elements
        // left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy temp to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array is:- ");
        printArray(arr);
    }
}

// OUTPUT:
// Sorted array is:- 
// 2 3 5 6 8 9 

// TC: O(nlogn) , SC: O(n)