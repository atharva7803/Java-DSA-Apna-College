// Question: Get ith bit

import java.util.Scanner;
public class getithbit {

    public static void getIthBit(int n, int i){
        int bitmask = 1<<i;
        if((n & bitmask) == 0){
            System.out.println("The ith bit is 0");
        }
        else{
            System.out.println("The ith bit is 1");
        }
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        getIthBit(10, 2);
    }
}