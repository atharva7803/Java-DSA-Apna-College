// Implementation of Ternary Operator

import java.util.Scanner;
public class ternaryop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*int num = 4;

        String type = ((num % 2) == 0) ? "Even number" : "Odd number";
        System.out.println(type);*/

        // To chech student is pass or fail
        System.out.println("Enter your marks: ");
        float marks = sc.nextFloat();
        
        String result = ((marks >= 33)) ? "Pass" : "Fail";
        System.out.println(result);
    }
}