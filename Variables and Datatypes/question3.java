/* Question 3. Enter cost of 3 items from the user (using float data type)- a pencil, a pen and a eraser.You 
               have to output the total cost of the items back to the user as the bill */

import java.util.Scanner;
public class question3 {
    public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter the cost of a pencil: ");
        float pencil = sc.nextInt();

        System.out.println("Enter the cost of a pen: ");
        float pen = sc.nextInt();

        System.out.println("Enter the cost of a eraser: ");
        float eraser = sc.nextInt();

        float total = pencil + pen + eraser;
        System.out.println("The total cost of the bill is: " + total);

        // Adding GST
        float bill = total + (0.18f * total);
        System.out.println("The total cost of the bill including GST is: " + bill);
    }
    }
}