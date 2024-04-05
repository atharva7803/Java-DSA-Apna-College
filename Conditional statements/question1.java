// Question 1. To check wether it is Positive or Negative
import java.util.Scanner;
public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Enter a number to check wether it is Positive or Negative: ");
        int num = sc.nextInt();

        String type = ((num >= 0)) ? "Number is Positive!" : "Number is negative!";
        System.out.println(type);
    }
}