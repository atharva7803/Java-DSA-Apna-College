// Question 3: Write a Java program to check if a number is a palindrome in Java? 
// (121 is a palindrome, 321 is not)

import java.util.Scanner;
public class question3 {

    public static boolean isPalindrome(int n){
        int palindrome = n;
        int reverse = 0;

        while(n != 0){
            int lastDigit = n % 10;
            reverse = reverse * 10 + lastDigit;
            palindrome = palindrome / 10;
        }

        if(n == palindrome){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 

        System.out.println("Enter a number to check wether it is palindrome or not: ");
        int num = sc.nextInt();

        if(isPalindrome(num)){
            System.out.println("The number is Palindrome!!!");
        }
        else{
            System.out.println("The number is not Palindrome!!!");
        }
    
    }
}