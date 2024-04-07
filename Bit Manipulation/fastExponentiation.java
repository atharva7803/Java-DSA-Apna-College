// // Question: Fast Exponentiation

import java.util.Scanner;
public class fastExponentiation {

    public static int fastExponentiation(int a, int n){    // a raise to n
        int ans = 1;
        while(n > 0){
            if((n & 1) != 0){   //check LSB
            ans = ans * a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        System.out.println(fastExponentiation(3, 50000));
    }
}