import java.util.Scanner;
public class greatestof3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Enter 3 number to find the greatest: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        /* if(a > b) {
            if(a > c){
                System.out.println("A is the greatest number: " + a);
            }
            else{
                System.out.println("C is the greatest of number: " + c);
            }   
        }
        else{
            if(b > c){
                System.out.println("B is the greatest number: " + b);
            }
            else{
                System.out.println("C is the greatest number: " + c);
            }
        } */

        // Another method
        if(a >= b && a >= c){
            System.out.println("A is the greatest number: " + a);
        }
        else{
            if(b >= c){
                System.out.println("B is the greatest number: " + b);
            }
            else{
                System.out.println("C is the greatest number: " + c);
            }
        }

    }
}