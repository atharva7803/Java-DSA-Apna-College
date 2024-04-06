// Addition of numbers using a function

import java.util.Scanner;
public class sum {

    public static int sum(int num1, int num2){    // These are parameters or formal parameters
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = sum(a,b);      // These are arguments or actual arguments
        System.out.println("The sum is: "+ sum);
    }
}