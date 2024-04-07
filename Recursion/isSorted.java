// To check if array is sorted or not
import java.util.Scanner;
public class isSorted {

    public static boolean isSorted(int arr[],int i){
        if(arr[i] == arr.length-1){     // base case
            System.out.println("Is array sorted:- ");
            return true;
        }
        if(arr[i] > arr[i+1]){
            System.out.println("Is array sorted:- ");
            return false;
        }
        return isSorted(arr, i+1);
    }   
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5};
        System.out.println(isSorted(arr, 0));
    }
}