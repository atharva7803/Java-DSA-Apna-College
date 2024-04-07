// Question: Check if even or odd

import java.util.Scanner;
public class evenOdd {

    public static void evenOdd(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("The number is even!");
        }
        else{
            System.out.println("The no. is odd!");
        }
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        evenOdd(3);
        evenOdd(6);
        evenOdd(9);
    }
}