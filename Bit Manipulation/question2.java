// Question 2 :Swap two numbers without using any third variable.

import java.util.Scanner;
public class question2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        int a = 3, b = 4;
        System.out.println("Before swaping: a = "+a + ", b = "+b);

        //Swapping using XOR
        a = a ^ b;
        b = a ^ b;   // a(new)  b(old)
        a = a ^ b;   // a(new)  b(new)

        System.out.println("After swaping: a = "+a + ", b = "+b);
    }
}

// Output: 
// Before swaping: a = 3, b = 4
// After swaping: a = 4, b = 3