// Question 1: Given an integer array nums, return true if any value appears at least twice in the array, 
// and return false if every element is distinct.
// Example: Input:nums = [1, 2, 3, 1]Output:   true 

import java.util.Scanner;
public class question1 {

    public static boolean doubleElement(int arr[]){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int num[] = new int[n];
        System.out.println("Enter " + n + " elements in array: ");
        for(int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }

        System.out.println(doubleElement(num));
    }
}

// Output:
// Enter the size of array: 
// 5   
// Enter 5 elements in array:
// 1 1 1 2 2
// true