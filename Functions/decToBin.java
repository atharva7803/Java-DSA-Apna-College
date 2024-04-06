// Question: Convert Decimal to Binary

import java.util.Scanner;
public class decToBin {

    public static void decToBin(int n){
        int pow = 0;
        int binNum = 0;
        int myNum = n;

        while(n > 0){
            int rem = n % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.println("The decimal of " + myNum + " is " + binNum);
    }

    public static void main(String[] args) {
        decToBin(101);
    }
}