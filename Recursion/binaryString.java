// Print all binary strings of size N without consecutive ones

import java.util.Scanner;
public class binaryString {

    public static void binaryString(int n, int lastPlace, String str){
        // base case
        if(n == 0){
            System.out.println(str);
            return;
        }

        // kaam
        if(lastPlace == 0){
            // if lastplace is 0 , then nextplace cane be 0 or 1
            binaryString(n-1,0, str+"0");
            binaryString(n-1,1, str+"1");
        }
        else{
            // if lastplace is 1, then nextplace will be only 0 
            binaryString(n-1, 0, str+"0");
        }
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        binaryString(3, 0, "");
    }
}

// Output:
// 000
// 001
// 010
// 100
// 101


