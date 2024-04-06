// Question 2: Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

import java.util.Scanner;
public class question2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        
        int num;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do{
            System.out.println("Enter the number: ");
            num = sc.nextInt();

            if(num % 2 == 0){
                evenSum += num;
            }
            else{
                oddSum += num;
            }

            System.out.println("Want to continue or not? Enter 1 for continue and 0 for exit!");
            choice = sc.nextInt();

        } while(choice == 1);
        
        System.out.println("The sum of even numbers is: " + evenSum);
        System.out.println("The sum of odd numbers is: " + oddSum);


    }
}