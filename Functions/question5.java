// Question 5 :Write a Java method to compute the sum of the digits in an integer.

import java.util.Scanner;
public class question5 {

    public static int sumOfDigits(int n){
        int sum = 0;
        while(n > 0){
            int lastDigit = n % 10;
            sum = sum + lastDigit;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("The sum of "+ n + " is: "+ sumOfDigits(n));
    }
}