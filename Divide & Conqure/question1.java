// Question1:Apply Merge sort to sort an array of Strings. (Assume that all the characters in all the Strings
//  are in lowercase). (EASY)
// Sample Input 1: arr = { "sun", "earth", "mars", "mercury"}
// Sample Output 1: arr = { "earth", "mars", "mercury","sun"}

import java.util.Arrays;
import java.util.Scanner;
public class question1 {


    public static void mergeSort(String[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        
        String[] temp = new String[arr.length];
        mergeSort(arr, temp, 0, arr.length - 1);
    }

    public static void mergeSort(String[] arr, String[] temp, int si, int ei) {
        if (si < ei) {
            int mid = si + (ei - si) / 2;
            mergeSort(arr, temp, si, mid);
            mergeSort(arr, temp, mid + 1, ei);

            merge(arr, temp, si, mid, ei);
        }
    }

    public static void merge(String[] arr, String[] temp, int si, int mid, int ei) {
        for (int i = si; i <= ei; i++) {
            temp[i] = arr[i];
        }

        int i = si;
        int j = mid + 1;
        int k = si;

        while (i <= mid && j <= ei) {
            if (temp[i].compareTo(temp[j]) <= 0) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            arr[k] = temp[i];
            i++;
            k++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = { "sun", "earth", "mars", "mercury" };
        mergeSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
