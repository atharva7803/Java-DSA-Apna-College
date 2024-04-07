// Implementation of Array initialization, input & updation

import java.util.Scanner;
public class inputArray {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        
        // Intialize array
        int marks[] = new int[100];

        System.out.println("Enter the marks of Physics, Chemistry and Maths: ");

        // Take input
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("Marks of Physics is: "+ marks[0]);
        System.out.println("Marks of Chemistry is: "+ marks[1]);
        System.out.println("Marks of Maths is: "+ marks[2]);

        // Update array
        marks[1] = marks[1] + 2;
        marks[2] = 99;
        System.out.println("Updated marks of physics is: "+marks[1]);
        System.out.println("Updated marks of Maths is: "+marks[2]);

        // Percentage
        int percentage = (marks[0] + marks[1] + marks[2])/3;
        System.out.println("Percentage is: "+ percentage);

        // To find array length
        System.out.println("Array length is: "+ marks.length);
    }
}