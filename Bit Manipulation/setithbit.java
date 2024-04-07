// Question: Set ith bit

import java.util.Scanner;
public class setithbit {

    public static int setithBit(int n, int i){
        int bitMask = 1<<i;
        // System.out.println("Value after setting ith bit: ");
        return n | bitMask;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        System.out.println(setithBit(10, 2));
    }
}