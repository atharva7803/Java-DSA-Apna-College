// Implementation of Java program that demonstrates the comparison of strings

import java.util.Scanner;
public class compareStrings {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        
        String s1 = "Tony";    
        String s2 = "Tony";    
        String s3= new String("Tony");

        if(s1 == s2){   // Output: Equal
            System.out.println("Strings are equal!");
        }
        else{
            System.out.println("Strings are not equal!");
        }

        if(s1 == s3){    // Output: Not equal bcz s3 is not equal to s1 at object level
            System.out.println("Strings are equal!");
        }
        else{
            System.out.println("Strings are not equal!");
        }

        if(s1.equals(s3)) {   // Output: Equal bcz it checks the value inside the s3
            System.out.println("Strings are equal!");
        }
        else{
            System.out.println("Strings are not equal!");
        }
    }
}