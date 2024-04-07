// Question: Count set bits in a number

import java.util.Scanner;
public class countSetBits {

    public static int countSetBits(int n){
        int count = 0;
        while(n > 0){
            if((n & 1) != 0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
                    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        System.out.println("The no of set bits: "+ countSetBits(15));
    }
}