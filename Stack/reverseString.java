// Reverse a string using stack

import java.util.Scanner;
import java.util.Stack;
public class reverseString {

    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();     // Using Java collection framework

        int ind = 0;
        while(ind < str.length()){
            s.push(str.charAt(ind));
            ind++;
        }

        StringBuilder result = new StringBuilder();   // To store the reversed string
        while(!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();

    }
     

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        
        String str = "abcde";
        String result = reverseString(str);
        System.out.println("Reversed String is: " + result);
    }
}