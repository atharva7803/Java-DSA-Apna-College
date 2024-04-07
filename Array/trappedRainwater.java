// Trapping Rainwater: GIven n non negative integers representing an elevation map where the width of each bar is 1, 
// Compute how much water it can trap after raining.

import java.util.Scanner;
public class trappedRainwater {

    public static int trappedRainwater(int height[]){
        // Calculate left max boundary array
        int n = height.length;
        int leftMax[] = new int[n];

        leftMax[0] = height[0];
        for(int i = 1; i < n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        // Calculate right max boundary array
        int rightMax[] = new int[n];

        rightMax[n-1] = height[n-1];
        for(int i = (n-2); i >= 0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater = 0;
        // loop
        for(int i = 0; i < n; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];    // += bcz to calculate the total sum
        }
        System.out.println("Trapped Water is: ");
        return trappedWater;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int height[] = new int[n];
        System.out.println("Enter " + n + " elements in array: ");
        for(int i = 0; i < n; i++){
            height[i] = sc.nextInt();
        }
        
        System.out.println(trappedRainwater(height));
    }
}
