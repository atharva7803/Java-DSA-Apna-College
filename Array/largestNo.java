// To find largest number in an array 

import java.util.Scanner;
public class largestNo {

    public static int largestNo(int num[]){

        // System.out.println("Enter the size of array: ");
        // int size = sc.nextInt();
        // for(int i = 1; i <=  size; i++){
        //     System.out.println("Enter elements: "+ num[i]);
        // }

        int largest = Integer.MIN_VALUE; // - infinity
        // int smallest = Integer.MAX_VALUE; // + infinity

        for(int i = 1; i <= num.length; i++){
            if(largest < num[i]){
                largest = num[i];
            }
            // if(smallest > num[i]){
            //     smallest = num[i];
            // }
        }
        return largest;

    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        int num[] = {10,52,60,70};
        System.out.println("Largest no. is: "+ largestNo(num));
    }
}