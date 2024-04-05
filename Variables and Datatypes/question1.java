// Question 1) In a program,input 3 numbers: A, B and C.You have to output the average of these 3 numbers.

import java.util.Scanner;
public class question1 {
    public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter 3 numbers: ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int avg = (A + B + C)/3;
        System.out.println("The average of entered 3 nmbers is: ");
        System.out.println(avg);
    }
    }
}