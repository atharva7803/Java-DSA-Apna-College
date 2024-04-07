import java.util.Scanner;
public class arrayBacktracking {

    public static void arrayBacktracking(int arr[], int i, int val){
        // base case
        if(i == arr.length){
            printArray(arr);
            return;
        }

        // recursion
        arr[i] = val;
        arrayBacktracking(arr, i+1, val+1);
        arr[i] = arr[i] - 2;
    }

    public static void printArray(int arr[]){
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        int arr[] = new int[5];
        arrayBacktracking(arr, 0, 1);
        printArray(arr);
    }
}