//Question2: In a program, input the side of a square. You have to output the area of the square.

import java.util.Scanner;
public class question2 {
    public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter the side of the Square: ");
        int side = sc.nextInt();

        int area = side * side;
        System.out.println("The area of the square is: ");
        System.out.println(area);
    }
    }
}