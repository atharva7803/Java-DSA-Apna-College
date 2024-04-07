// Implementation of String input /output 

import java.util.Scanner;
public class stringInput {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        char arr[] = {'a','b','c','d'};
        String str1 = "abcd";      // String initialization
        String str2 = new String("xyz");    // String initialization 2nd method

        // Strings are immutable

        String name;
        System.out.println("Enter your name: ");

        name = sc.nextLine();    // nextLine()  for taking whole line
        System.out.println("Your name is: " + name);

    }
}