// Question :Use the following sorting algorithms tosort an array in DESCENDING order :\
// a.Bubble Sort  b.Selection Sort  c.Insertion Sort  d.Counting Sort 
// You can use this array as an example :[3,6,2,1,8,7,4,5,3,1]

import java.util.Scanner;
public class question {

    public static void bubbleSort(int arr[]){
        for(int turn = 0; turn < arr.length; turn++){
            for(int j = 0; j < arr.length - 1; j++){
                if(arr[j] < arr[j+1]){     // For Descending Order
                    int temp = arr[j];  
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }           
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int smallest = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] > arr[smallest]) {     // Descinding order
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];   // arr[i] bcz for 0th index we need 1st smallest , for 1st index we need 2nd smallest...
            arr[i] = temp;
        }
    }

    public static void insertionSort(int arr[]){
        for(int i = 0; i < arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            // To find the correct positon to insert
            while(prev >= 0 && arr[prev] < curr){      // Descinding order
                arr[prev+1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev+1] = curr;
        }        
    }

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
        for(int i = count.length-1 ; i >= 0; i--){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
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

        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        countingsort(arr);
        
        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


// Output:
// Enter the size of the array: 10
// Enter the elements of the array:
// 3 6 2 1 8 7 4 5 3 1
// Sorted Array:
// 8 7 6 5 4 3 3 2 1 1