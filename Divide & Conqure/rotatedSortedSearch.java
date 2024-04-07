import java.util.Scanner;
public class rotatedSortedSearch {

    public static int search(int arr[], int targ, int si, int ei){
        // base case
        if(si > ei){
            return -1;
        }

        int mid = si + (ei - si)/2;

        if(arr[mid] == targ){
            return mid;
        }

        // case 1: mid on L1
        if(arr[si] <= arr[mid]){
            // case a: on left side
            if(arr[si] <= targ && targ <= arr[mid]){
                return search(arr, targ, si, mid-1);
            }
            else{
                // case b: on right side
                return search(arr, targ, mid+1, ei);
            }
        }

        // case2: mid on L2
        else{
            // case c: on right side
            if(arr[mid] <= targ && targ <= arr[ei]){
                return search(arr, targ, mid+1, ei);
            }
            else{
                // case d: on left side
                return search(arr, targ, si, mid-1);
            }
        }
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        int arr[] = { 4,5,6,7,0,1,2};
        int targ = 0;
        int targIdx = search(arr, targ, 0, arr.length-1);
        System.out.println("The index of target is: "+ targIdx);
    }
}