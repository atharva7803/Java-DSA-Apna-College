// Question: Convert Binary to Decimal

import java.util.Scanner;
public class binToDec {

    public static void binToDec(int binNum){
        int pow = 0;
        int dec = 0;
        int myNum = binNum;
        
        while(binNum > 0){
            int lastDigit = binNum % 10;     //To get the last digit of no.
            dec = dec + (lastDigit * (int)Math.pow(2, pow));
            pow++;

            binNum = binNum / 10;     // To reduce the no.
        }

        System.out.println("The decimal of " + myNum + " is: " + dec);
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        
        binToDec(1010111);
    }
}