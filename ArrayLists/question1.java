// Problem: Monotonic ArrayList

// An ArrayList is considered monotonic if it is either monotone increasing or monotone decreasing.
// An ArrayList nums is monotone increasing if, for all indices i and j 
// where i <= j, nums.get(i) <= nums.get(j).
// An ArrayList nums is monotone decreasing if, for all indices i and j 
// where i <= j, nums.get(i) >= nums.get(j).

// Write a function in Java to determine whether a given ArrayList nums is monotonic. 
// Return true if the list is monotonic, and false otherwise.

// Sample Input 1: nums = [1,2,2,3] Sample Output 1: true
// Sample Input 2: nums = [6,5,4,4] Sample Output 2: true
// Sample Input 3: nums = [1,3,2] Sample Output 3: false

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class question1 {

    public static boolean isMonotonic(ArrayList<Integer> list){
        boolean inc = true;
        boolean dec = true;

        for(int i = 0; i < list.size()-1; i++){
            if(list.get(i) > list.get(i+1)){
                inc = false;
            }
            if(list.get(i) < list.get(i+1)){
                dec = false;
            }
        }
        return inc || dec;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        ArrayList<Integer> nums1 = new ArrayList<>(List.of(1, 2, 2, 3));
        System.out.println(isMonotonic(nums1)); // Output: true

        // Sample Input 2
        ArrayList<Integer> nums2 = new ArrayList<>(List.of(6, 5, 4, 4));
        System.out.println(isMonotonic(nums2)); // Output: true

        // Sample Input 3
        ArrayList<Integer> nums3 = new ArrayList<>(List.of(1, 3, 2));
        System.out.println(isMonotonic(nums3)); // Output: false
    }
}