// Implementation to reverse array

import java.util.Arrays;
import java.util.Scanner;

public class reverseArray {
    
    public static void reverseArray(int arr[]) {
        int first = 0, last = arr.length - 1;
        
        while (first < last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            
            first++;
            last--;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Original array: " + Arrays.toString(arr));
        
        reverseArray(arr);
        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
}
