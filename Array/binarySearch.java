// Implementation of Binary Search

import java.util.Scanner;
public class binarySearch {

    public static int binarySearch(int arr[],int key){
        int first = 1;
        int last = arr.length-1;
        int mid = (first + last)/2;

        while(first <= last){
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid] < key){
                first = mid + 1;
            }
            else{
                last = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        System.out.println("Enter "+ n + " elements in array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the key element to search: ");
        int key = sc.nextInt();

        int index = binarySearch(arr, key);
        if(index == -1){
            System.out.println("Key element not found!");
        }
        else{
            System.out.println("Key element found at index: "+ index);
        }

    }
}