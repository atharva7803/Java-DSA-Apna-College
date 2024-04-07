// Question 2 :You are given a number (eg -  2019), convert it into a String of english like “two zero one nine”.  Use a recursive function to solve this problem.
// NOTE-The digits of the number will only be in the range 0-9 and the lastdigit of a number can’t be 0. 
// Sample Input: 1947 
// Sample Output: “one nine four seven"

import java.util.Scanner;
public class question2 {

    static String digits[] = {"zero","one","two","three","four","five","six","seven","eight","nine",};

    public static void convertNumber(int n){
        if(n == 0){
            return;
        }
        
        int lastdigit = n % 10;
        convertNumber(n/10);
        System.out.print(digits[lastdigit] +" ");      
    }


    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        System.out.println("The number in string form is:- " );
        convertNumber(1947);
    }
}

// Output:
// The number in string form is:- 
// one nine four seven