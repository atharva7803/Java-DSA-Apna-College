// Question: To check if a string is Palindrome

import java.util.Scanner;
public class palindrome {

    public static boolean isPalindrome(String str){
        int n = str.length();
        for(int i = 0; i < n/2; i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                // For not a palindrome
                System.out.println("String is not palindorme!");
                return false;
            }
        }
        System.out.println("String is plaindrome!");
        return true;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        String str;

        System.out.println("Enter a string: ");
        str = sc.nextLine();

        System.out.println(isPalindrome(str));
    }
}