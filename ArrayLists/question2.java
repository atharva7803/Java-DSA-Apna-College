// Lonely Numbers in ArrayList

// You are given an ArrayList of integers, nums. A number x is considered lonely when it appears exactly once,
// and no adjacent numbers (i.e., x + 1 and x - 1) appear in the ArrayList. Return all lonely numbers in nums.
// The order of the returned numbers does not matter.

// Sample Input 1: nums = [10,6,5,8]
// Sample Output 1: [10,8]
// Explanation :
// - 10 is a lonely number since it appears exactly once and 9 and 11 does not appear in nums.
// - 8 is a lonely number since it appears exactly once and 7 and 9 does not appear in nums.
// - 5 is not a lonely number since 6 appears in nums and vice versa.Hence, the lonely numbers in nums are [10, 8].
// Note that [8, 10] may also be returned.

// Sample Input 2: nums = [1,3,5,3]
// Sample Output 2: [1,5]
// Explanation :
// - 1 is a lonely number since it appears exactly once and 0 and 2 does not appear in nums.
// - 5 is a lonely number since it appears exactly once and 4 and 6 does not appear in nums.
// - 3 is not a lonely number since it appears twice.Hence, the lonely numbers in nums are [1, 5].
// Note that [5, 1] may also be returned.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
public class question2 {

    public static ArrayList<Integer> LonelyNumbers(ArrayList<Integer> nums){
        ArrayList<Integer> lonelyNumbers = new ArrayList<>();
        HashSet<Integer> adjacentNumbers = new HashSet<>();

        for (int i = 0; i < nums.size(); i++) {
            int num = nums.get(i);

            if (!adjacentNumbers.contains(num - 1) && !adjacentNumbers.contains(num + 1)) {
                lonelyNumbers.add(num);
            }

            adjacentNumbers.add(num);
        }

        return lonelyNumbers;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        // Sample Input 1
        ArrayList<Integer> nums1 = new ArrayList<>(List.of(10, 6, 5, 8));
        System.out.println("Lonely Numbers (Sample 1): " + LonelyNumbers(nums1)); // Output: [10, 8]

        // Sample Input 2
        ArrayList<Integer> nums2 = new ArrayList<>(List.of(1, 3, 5, 3));
        System.out.println("Lonely Numbers (Sample 2): " + LonelyNumbers(nums2)); // Output: [1, 5]
    }
}
