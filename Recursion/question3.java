// Question 3 :Write a program to find Length of a String using Recursion.

import java.util.Scanner;
public class question3 {

    public static int findLength(String str){
        if(str.length() == 0){
            return 0;
        }

        return findLength(str.substring(1)) + 1;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        System.out.println("Length of string is: " + findLength("Atharva"));
    }
}

// Output: Length of string is: 7 