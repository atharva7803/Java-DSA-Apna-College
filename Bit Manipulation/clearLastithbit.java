// Question: Clear last ith bit

import java.util.Scanner;
public class clearLastithbit {

    public static int clearLastithbit(int n, int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        System.out.println(clearLastithbit(15, 2));
    }
}