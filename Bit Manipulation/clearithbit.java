// Question: Clear ith bit

import java.util.Scanner;
public class clearithbit {

    public static int clearithbit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        System.out.println(clearithbit(10, 1));
    }
}