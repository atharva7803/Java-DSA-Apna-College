// Question 2: Write a method named isEven that accepts an int argument. The method should return true if 
// the argument is even, or false otherwise. Also write a program to test your method.

import java.util.Scanner;
public class question2 {

    public static boolean isEven (int n){
        if(n % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        
        System.out.println("Enter number: ");
        int num = sc.nextInt();

        if(isEven(num) == true){
            System.out.println(num + " is even no.");
        }
        else{
            System.out.println(num + " is not even no.");
        }
    }
}