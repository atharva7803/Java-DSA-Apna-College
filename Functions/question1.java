// Question 1 :Write a Java method to compute the averageof three numbers.

import java.util.Scanner;
public class question1 {

    public static double average(double a, double b, double c){
        return (a+b+c)/3; 
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        
        System.out.println("Enter 3 no for calculating avg: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        System.out.println("The average is"+ average(a, b, c));
    }
}