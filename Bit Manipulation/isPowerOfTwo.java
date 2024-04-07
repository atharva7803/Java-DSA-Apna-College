// Question: Check if no is power of 2

import java.util.Scanner;
public class isPowerOfTwo {

    public static boolean isPowerOfTwo(int n){
        return (n & (n-1)) == 0;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        System.out.println(isPowerOfTwo(8));
    }
}