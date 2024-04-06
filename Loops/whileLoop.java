// To print sum of N natural numbers using while loop

import java.util.Scanner;
public class whileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Enter the no. upto which you have to add the values: ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 0;

        while(i <= n){
            sum = sum + i;  // sum +=
            i++;
        }
        System.out.println("The sum is: " + sum);
    }
}