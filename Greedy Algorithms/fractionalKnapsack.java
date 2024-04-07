// give the weights & value of N items, put these items in a knapsack of capcaity W to get the maximum
// total value in the knapsack

// Algorithm
// 1. Given 2 arrays of val and weight , and the capacity(W) = 50
// 2. Take 2d array to sort the ratio: 0th col = index, 1st col = ratio
// 3. for(0 -> val.lenght){ intitalise the 0th col to index and 1st col to the ratio }
// 4. Use lambda function to sort thre ratio in ascending order
// 5. Initalise capacity = W and finalVal = 0
// 6. Take for loop which traverse backwards form ratio arr
// 7. Inside loop put the conditions of including full item and second including fractional item

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class fractionalKnapsack {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        
        int val[] = {60,100,120};
        int weight[] = {10,20,30};
        int W = 50;

        double ratio[][] = new double[val.length][2];

        for(int i = 0; i < val.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)weight[i];
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));      // lambda function

        int capacity = W;
        int finalVal = 0;
        for(int i = ratio.length-1; i >= 0; i--){
            int index = (int)ratio[i][0];   
            if(capacity >= weight[index]){
                finalVal += val[index];
                capacity -= weight[index];
            }
            else{
                finalVal += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }

        System.out.println("Final Vlaue: " + finalVal);
    }
}