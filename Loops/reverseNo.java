// Question: Reverse a number

import java.util.Scanner;
public class reverseNo {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        System.out.println("Enter no. to be reversed: ");
        int n = sc.nextInt();

        while(n > 0){
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n = n / 10;
        }
    }
}