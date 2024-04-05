/* Question2:Finish the following code so that it prints You havea fever if your temperature is above 100 
and otherwise prints You don't have a fever.

public class Solution{
    public static void main(String[]args) {
        double temp=103.5;
    } 
*/

import java.util.Scanner;
public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the temperature to check wether there is fever or not: ");
        double temp  = sc.nextDouble();

        String report = ((temp >= 100)) ? "You are having Fever😕!" : "You are not having fever😁";
        System.out.println(report);
    }
}